package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class ViewCliente implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private JButton busca;
	private JTextField nomeBusca;
	private static ControleDados dados;
	private JList<String> listaClientesCadastrados;
	private String[] listaNomes = new String[50];
	
	public void mostrarDados(ControleDados d, int op){
		dados = d;
		switch (op) {
		case 1:
			listaNomes = new ControleCliente(dados).getNomeCliente();
			listaClientesCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Clientes");
			titulo = new JLabel("Clientes Cadastrados");
			cadastroCliente = new JButton("Cadastrar");
			refreshCliente = new JButton("Refresh");
			busca = new JButton("Pesquisar");
			nomeBusca = new JTextField();

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaClientesCadastrados.setBounds(20, 50, 350, 120);
			listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaClientesCadastrados.setVisibleRowCount(10);

			cadastroCliente.setBounds(70, 190, 100, 30);
			refreshCliente.setBounds(200, 190, 100, 30);
			
			nomeBusca.setBounds(20, 240, 230, 30);
			busca.setBounds(270, 240, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaClientesCadastrados);
			janela.add(cadastroCliente);
			janela.add(refreshCliente);
			janela.add(nomeBusca);
			janela.add(busca);

			janela.setSize(400, 320);
			janela.setLocationRelativeTo(null);
			janela.setVisible(true);

			cadastroCliente.addActionListener(this);
			refreshCliente.addActionListener(this);
			busca.addActionListener(this);
			listaClientesCadastrados.addListSelectionListener(this);

			break;

		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastroCliente)
			new ViewDetalheCliente().inserirEditar(1, dados, this, 0);

		if(src == refreshCliente) {
			listaClientesCadastrados.setListData(new ControleCliente(dados).getNomeCliente());			
			listaClientesCadastrados.updateUI();
		}
		
		if (src == busca) {
			String digitado = nomeBusca.getText();
			int i = 0;
			String[] nome = new String[1];
			boolean achado = false;
			
			do {
				nome[0] = dados.getModeloDados().getCliente()[i].getNomeCliente();
				if(digitado.toUpperCase().equals(nome[0].toUpperCase())) {
					listaClientesCadastrados.setListData(nome);
					listaClientesCadastrados.updateUI();
					achado = true;
				}
				i++;
			}while(i < dados.getQtdCliente() && achado == false);
			
			if(!achado)
				mensagemErroBusca();
		}


	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaClientesCadastrados) {
			new ViewDetalheCliente().inserirEditar(2, dados, this, listaClientesCadastrados.getSelectedIndex());
		}
	}
	
	public void mensagemErroBusca() {
		JOptionPane.showMessageDialog(null,"Clientes não encontrado.\n " , null, 
				JOptionPane.ERROR_MESSAGE);
	}
}
