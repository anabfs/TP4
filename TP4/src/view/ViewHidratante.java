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

public class ViewHidratante implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroHidratante;
	private JButton refreshHidratante;
	private static ControleDados dados;
	private JList<String> listaHidratanteCadastradas;
	private String[] listaCodigos = new String[50];
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;
		
		if(op == 3) {
			listaCodigos = new ControleHidratante(dados).getNomeHidratante();
			listaHidratanteCadastradas = new JList<String>(listaCodigos);
			janela = new JFrame("Hidratante");
			titulo = new JLabel("Hidratante cadastrados");
			cadastroHidratante = new JButton("Cadastrar");
			refreshHidratante = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaHidratanteCadastradas.setBounds(20, 50, 350, 120);
			listaHidratanteCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaHidratanteCadastradas.setVisibleRowCount(10);

			cadastroHidratante.setBounds(70, 177, 100, 30);
			refreshHidratante.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaHidratanteCadastradas);
			janela.add(cadastroHidratante);
			janela.add(refreshHidratante);
			
			janela.setSize(400, 250);
			janela.setVisible(true);
			
			cadastroHidratante.addActionListener(this);
			refreshHidratante.addActionListener(this);
			listaHidratanteCadastradas.addListSelectionListener(this);
		}else {

			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == cadastroHidratante)
			new ViewDetalheHidratante().inserirEditar(1, dados, this, 0);
		
		if (src == refreshHidratante) {
			listaHidratanteCadastradas.setListData(new ControleHidratante(dados).getNomeHidratante());
			listaHidratanteCadastradas.updateUI();
		}
	}
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if (e.getValueIsAdjusting() && src == listaHidratanteCadastradas) {
			new ViewDetalheHidratante().inserirEditar(2, dados, this, listaHidratanteCadastradas.getSelectedIndex());
		}
	}
}
