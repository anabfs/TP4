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

public class ViewPerfume implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroPerfume;
	private JButton refreshPerfume;
	private JButton busca;
	private JTextField nomeBusca;
	private static ControleDados dados;
	private JList<String> listaPerfumeCadastrados;
	
	private String[] listaCodPerfume = new String[50];
	
	/**
	 * Método para mostrar perfumes cadastrados
	 * @param d importa valores da ControleDados
	 * @param op opção do menu
	 */
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;
		
		if(op == 1) {
			
			listaCodPerfume = new ControlePerfume(dados).getNomePerfume();
			listaPerfumeCadastrados = new JList<String>(listaCodPerfume);
			janela = new JFrame("Perfumes");
			titulo = new JLabel("Perfumes cadastrados");
			cadastroPerfume = new JButton("Cadastrar");
			refreshPerfume = new JButton("Refresh");
			busca = new JButton("Pesquisar");
			nomeBusca = new JTextField();

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(70, 10, 300, 30);
			listaPerfumeCadastrados.setBounds(20, 50, 350, 120);
			listaPerfumeCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaPerfumeCadastrados.setVisibleRowCount(10);

			cadastroPerfume.setBounds(70, 190, 100, 30);
			refreshPerfume.setBounds(200, 190, 100, 30);
			
			nomeBusca.setBounds(20, 240, 230, 30);
			busca.setBounds(270, 240, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaPerfumeCadastrados);
			janela.add(cadastroPerfume);
			janela.add(refreshPerfume);
			janela.add(nomeBusca);
			janela.add(busca);

			janela.setSize(400, 320);
			janela.setLocationRelativeTo(null);
			janela.setVisible(true);

			cadastroPerfume.addActionListener(this);
			refreshPerfume.addActionListener(this);
			busca.addActionListener(this);
			listaPerfumeCadastrados.addListSelectionListener(this);
		
		}else{
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Realiza as ações dos botões
	 */
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == cadastroPerfume) // Cadastrar perfume
			new ViewDetalhePerfume().inserirEditar(1, dados, this, 0);
		
		if (src == refreshPerfume) { // Atualizar lista de perfumes
			listaPerfumeCadastrados.setListData(new ControlePerfume(dados).getNomePerfume());
			listaPerfumeCadastrados.updateUI();
		}
		
		if (src == busca) { // Pesquisar um perfume pelo nome
			String digitado = nomeBusca.getText();
			int i = 0;
			String[] nome = new String[1];
			boolean achado = false;
			
			do {
				nome[0] = dados.getModeloDados().getPerfume()[i].getNomeProduto();
				if(digitado.toUpperCase().equals(nome[0].toUpperCase())) {
					listaPerfumeCadastrados.setListData(nome);
					listaPerfumeCadastrados.updateUI();
					achado = true;
				}
				i++;
			}while(i < dados.getModeloDados().getPerfume().length && achado == false);
			
			if(!achado)
				mensagemErroBusca();
		}
		
	}
	
	/**
	 * Realiza ações do JList
	 */
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if (e.getValueIsAdjusting() && src == listaPerfumeCadastrados) {
			new ViewDetalhePerfume().inserirEditar(2, dados, this, listaPerfumeCadastrados.getSelectedIndex());
		}
		
	}
	
	public void mensagemErroBusca() {
		JOptionPane.showMessageDialog(null,"Perfume não encontrado.\n " , null, 
				JOptionPane.ERROR_MESSAGE);
	}

}
