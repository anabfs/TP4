package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.*;

/**
 * Classe que contem as informações da view
 * @author Ana Baetriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ViewHidratante implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroHidratante;
	private JButton refreshHidratante;
	private JButton busca;
	private JTextField nomeBusca;
	private static ControleDados dados;
	private JList<String> listaHidratanteCadastradas;
	private String[] listaCodigos = new String[50];
	
	/**
	 * Método para mostrar hidratantes cadastrados
	 * @param d importa valores da ControleDados
	 * @param op opção do menu
	 */
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;
		
		if(op == 3) {
			listaCodigos = new ControleHidratante(dados).getNomeHidratante();
			listaHidratanteCadastradas = new JList<String>(listaCodigos);
			janela = new JFrame("Hidratante");
			titulo = new JLabel("Hidratante cadastrados");
			cadastroHidratante = new JButton("Cadastrar");
			refreshHidratante = new JButton("Refresh");
			busca = new JButton("Pesquisar");
			nomeBusca = new JTextField();

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaHidratanteCadastradas.setBounds(20, 50, 350, 120);
			listaHidratanteCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaHidratanteCadastradas.setVisibleRowCount(10);

			cadastroHidratante.setBounds(70, 190, 100, 30);
			refreshHidratante.setBounds(200, 190, 100, 30);
			
			nomeBusca.setBounds(20, 240, 230, 30);
			busca.setBounds(270, 240, 100, 30);
			
			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaHidratanteCadastradas);
			janela.add(cadastroHidratante);
			janela.add(refreshHidratante);
			janela.add(nomeBusca);
			janela.add(busca);
			
			janela.setSize(400, 320);
			janela.setLocationRelativeTo(null);
			janela.setVisible(true);
			
			cadastroHidratante.addActionListener(this);
			refreshHidratante.addActionListener(this);
			busca.addActionListener(this);
			listaHidratanteCadastradas.addListSelectionListener(this);
		}else {

			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}
	}
	/**
	 * Realiza as ações dos botões
	 */
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == cadastroHidratante) // Cadastrar um hidratante
			new ViewDetalheHidratante().inserirEditar(1, dados, this, 0);
		
		if (src == refreshHidratante) { // Atualizar lista de hidratantes
			listaHidratanteCadastradas.setListData(new ControleHidratante(dados).getNomeHidratante());
			listaHidratanteCadastradas.updateUI();
		}
		
		if (src == busca) { //Pesquisar um hidratante pelo nome
			String digitado = nomeBusca.getText();
			int i = 0;
			String[] nome = new String[1];
			boolean achado = false;
			
			do {
				nome[0] = dados.getModeloDados().getHidratante()[i].getNomeProduto();
				if(digitado.toUpperCase().equals(nome[0].toUpperCase())) {
					listaHidratanteCadastradas.setListData(nome);
					listaHidratanteCadastradas.updateUI();
					achado = true;
				}
				i++;
			}while(i < dados.getQtdHidratante() && achado == false);
			
			if(!achado)
				mensagemErroBusca();
		}
	}
	
	/**
	 * Realiza ações do JList
	 */
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if (e.getValueIsAdjusting() && src == listaHidratanteCadastradas) {
			new ViewDetalheHidratante().inserirEditar(2, dados, this, listaHidratanteCadastradas.getSelectedIndex());
		}
	}
	public void mensagemErroBusca() {
		JOptionPane.showMessageDialog(null,"Hidratante não encontrado.\n " , null, 
				JOptionPane.ERROR_MESSAGE);
	}
}
