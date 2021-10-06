package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.*;

public class ViewVenda implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroVenda;
	private JButton refreshVenda;
	private static ControleDados dados;
	private JList<String> listaVendasCadastradas;
	private String[] listaCodVendas = new String[50];

	public void mostrarDados(ControleDados d, int op) {
		dados = d;

		if (op == 1) {
			listaCodVendas = new ControleVenda(dados).getIDVenda();
			listaVendasCadastradas = new JList<String>(listaCodVendas);
			janela = new JFrame("Vendas");
			titulo = new JLabel("Vendas Cadastradas");
			cadastroVenda = new JButton("Cadastrar");
			refreshVenda = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaVendasCadastradas.setBounds(20, 50, 350, 120);
			listaVendasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaVendasCadastradas.setVisibleRowCount(10);

			cadastroVenda.setBounds(70, 177, 100, 30);
			refreshVenda.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaVendasCadastradas);
			janela.add(cadastroVenda);
			janela.add(refreshVenda);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroVenda.addActionListener(this);
			refreshVenda.addActionListener(this);
			listaVendasCadastradas.addListSelectionListener(this);
		} else {

			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	} 
	
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaVendasCadastradas) {
			new ViewDetalheVenda().inserirEditar(2, dados, this, listaVendasCadastradas.getSelectedIndex());
		}
		
	}

	
	public void actionPerformed(ActionEvent e) {
	Object src = e.getSource();

	if (src == cadastroVenda)
		new ViewDetalheVenda().inserirEditar(1, dados, this, 0);

	if (src == refreshVenda) {
		listaVendasCadastradas.setListData(new ControleVenda(dados).getIDVenda());
		listaVendasCadastradas.updateUI();
		}
	}
}
