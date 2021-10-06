package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class ViewMenu implements ActionListener {
	private static JFrame janela = new JFrame("Controle de Curso");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton perfume = new JButton("Perfume");
	private static JButton desodorante = new JButton("Desodorante");
	private static JButton hidratante = new JButton("Hidratante");
	private static JButton cliente = new JButton("Cliente");
	private static JButton venda = new JButton("Venda");
	public static ControleDados dados = new ControleDados();
	
	public ViewMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		perfume.setBounds(140, 50, 100, 30);
		desodorante.setBounds(140, 100, 100, 30);
		hidratante.setBounds(140, 150, 100, 30);
		cliente.setBounds(140, 200, 100, 30);
		venda.setBounds(140, 250, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(perfume);
		janela.add(desodorante);
		janela.add(hidratante);
		janela.add(cliente);
		janela.add(venda);
		
		janela.setSize(400, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		ViewMenu menu = new ViewMenu();
		
		perfume.addActionListener(menu);
		desodorante.addActionListener(menu);
		hidratante.addActionListener(menu);
		cliente.addActionListener(menu);
		venda.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == perfume)
			new ViewPerfume().mostrarDados(dados, 1); // trocar a nova View que será mostrada

		if (src == desodorante)
			new ViewDesodorante().mostrarDados(dados, 2); // trocar a nova View que será mostrada

		if (src == hidratante)
			new ViewHidratante().mostrarDados(dados, 3); // trocar a nova View que será mostrada

		if (src == venda)
			new ViewVenda().mostrarDados(dados, 1); // trocar a nova View que será mostrada

		if (src == cliente)
			new ViewCliente().mostrarDados(dados, 1); // trocar a nova View que será mostrada

	
	}
}
