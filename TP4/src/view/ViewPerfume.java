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

public class ViewPerfume implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroPerfume;
	private JButton refreshPerfume;
	private static ControleDados dados;
	private JList<String> listaPerfumeCadastrados;
	
	private String[] listaCodPerfume = new String[50];
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;
		
		if(op == 1) {
			
			listaCodPerfume = new ControlePerfume(dados).getNomePerfume();
			listaPerfumeCadastrados = new JList<String>(listaCodPerfume);
			janela = new JFrame("Perfumes");
			titulo = new JLabel("Perfumes cadastrados");
			cadastroPerfume = new JButton("Cadastrar");
			refreshPerfume = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(70, 10, 300, 30);
			listaPerfumeCadastrados.setBounds(20, 50, 350, 120);
			listaPerfumeCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaPerfumeCadastrados.setVisibleRowCount(10);

			cadastroPerfume.setBounds(70, 177, 100, 30);
			refreshPerfume.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaPerfumeCadastrados);
			janela.add(cadastroPerfume);
			janela.add(refreshPerfume);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroPerfume.addActionListener(this);
			refreshPerfume.addActionListener(this);
			listaPerfumeCadastrados.addListSelectionListener(this);
		
		}else{
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == cadastroPerfume)
			new ViewDetalhePerfume().inserirEditar(1, dados, this, 0);
		
		if (src == refreshPerfume) {
			listaPerfumeCadastrados.setListData(new ControlePerfume(dados).getNomePerfume());
			listaPerfumeCadastrados.updateUI();
		}
		
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if (e.getValueIsAdjusting() && src == listaPerfumeCadastrados) {
			new ViewDetalhePerfume().inserirEditar(2, dados, this, listaPerfumeCadastrados.getSelectedIndex());
		}
		
	}

}
