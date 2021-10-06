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

public class ViewDesodorante implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroDesodorante;
	private JButton refreshDesodorante;
	private static ControleDados dados;
	private JList<String> listaDesodorantesCadastradas;
	private String[] listaCodigos = new String[50];
	
	public void mostrarDados(ControleDados d, int op) {
		dados = d;
		if(op == 2) {
			listaCodigos = new ControleDesodorante(dados).getNomeDesodorante();
			listaDesodorantesCadastradas = new JList<String>(listaCodigos);
			janela = new JFrame("Desodorantes");
			titulo = new JLabel("Desodorantes Cadastradas");
			cadastroDesodorante = new JButton("Cadastrar");
			refreshDesodorante = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaDesodorantesCadastradas.setBounds(20, 50, 350, 120);
			listaDesodorantesCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaDesodorantesCadastradas.setVisibleRowCount(10);

			cadastroDesodorante.setBounds(70, 177, 100, 30);
			refreshDesodorante.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaDesodorantesCadastradas);
			janela.add(cadastroDesodorante);
			janela.add(refreshDesodorante);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroDesodorante.addActionListener(this);
			refreshDesodorante.addActionListener(this);
			listaDesodorantesCadastradas.addListSelectionListener(this);
		}else {
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == cadastroDesodorante)
			new ViewDetalheDesodorante().inserirEditar(1, dados, this, 0);
		if (src == refreshDesodorante) {
			listaDesodorantesCadastradas.setListData(new ControleDesodorante(dados).getNomeDesodorante());
			listaDesodorantesCadastradas.updateUI();
		}
	}
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
	
		if (e.getValueIsAdjusting() && src == listaDesodorantesCadastradas) {
			new ViewDetalheDesodorante().inserirEditar(2, dados, this, listaDesodorantesCadastradas.getSelectedIndex());
		}
		
	}

}
