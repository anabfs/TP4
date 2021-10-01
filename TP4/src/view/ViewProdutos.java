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

public class ViewProdutos implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroPerfume;
	private JButton refreshPerfume;
	private JButton cadastroDesodorante;
	private JButton refreshDesodorante;
	private JButton cadastroHidratante;
	private JButton refreshHidratante;
	private static ControleDados dados;
	private JList<String> listaPerfumeCadastrados;
	private JList<String> listaDesodorantesCadastradas;
	private JList<String> listaHidratanteCadastradas;

	private String[] listaCodigos = new String[50];

	public void mostrarDados(ControleDados d, int op) {
		dados = d;

		switch (op) {
		case 1:
			listaCodigos = new ControlePerfume(dados).getNomePerfume();
			listaPerfumeCadastrados = new JList<String>(listaCodigos);
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

			break;

		case 2:
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
			break;

		case 3:
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
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == cadastroPerfume)
			new ViewDetalheProdutos().inserirEditar(1, dados, this, 0);

		if (src == cadastroDesodorante)
			new ViewDetalheProdutos().inserirEditar(2, dados, this, 0);

		if (src == cadastroHidratante)
			new ViewDetalheProdutos().inserirEditar(3, dados, this, 0);

		if (src == refreshPerfume) {
			listaPerfumeCadastrados.setListData(new ControlePerfume(dados).getNomePerfume());
			listaPerfumeCadastrados.updateUI();
		}

		if (src == refreshDesodorante) {
			listaDesodorantesCadastradas.setListData(new ControleDesodorante(dados).getNomeDesodorante());
			listaDesodorantesCadastradas.updateUI();
		}

		if (src == refreshHidratante) {
			listaHidratanteCadastradas.setListData(new ControleHidratante(dados).getNomeHidratante());
			listaHidratanteCadastradas.updateUI();
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaPerfumeCadastrados) {
			new ViewDetalheProdutos().inserirEditar(4, dados, this, listaPerfumeCadastrados.getSelectedIndex());
		}

		if (e.getValueIsAdjusting() && src == listaDesodorantesCadastradas) {
			new ViewDetalheProdutos().inserirEditar(5, dados, this, listaDesodorantesCadastradas.getSelectedIndex());
		}

		if (e.getValueIsAdjusting() && src == listaHidratanteCadastradas) {
			new ViewDetalheProdutos().inserirEditar(6, dados, this, listaHidratanteCadastradas.getSelectedIndex());
		}
	}
}