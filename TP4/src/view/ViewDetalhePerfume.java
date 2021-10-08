package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.ControleDados;

/**
 * Classe que contem as informações da view
 * @author Ana Baetriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ViewDetalhePerfume implements ActionListener {
	private JFrame janela;
	private JLabel labelNomeProduto = new JLabel("Nome: ");
	private JTextField valorNomeProduto;
	private JLabel labelLinhaProduto = new JLabel("Linha: ");
	private JTextField valorLinhaProduto;
	private JLabel labelTamanho = new JLabel("Tamanho: ");
	private JTextField valorTamanho;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel labelPreco = new JLabel("Preço: ");
	private JTextField valorPreco;
	private JLabel labelGenero = new JLabel("Genero: ");
	private JTextField valorGenero;
	private JLabel labelFamilia = new JLabel("Familia olfativa: ");
	private JTextField valorFamilia;
	private JLabel labelSub = new JLabel("Sub familia olfativa: ");
	private JTextField valorSub;
	private JLabel labelConsen = new JLabel("Consentração: ");
	private JTextField valorConsen;
	
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[10];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	/**
	 * Método para inserir e/ou editar perfume
	 * @param op opção selecionada
	 * @param d importa valores da ControleDados
	 * @param p dados da ViewPerfume
	 * @param pos posição do perfume
	 */
	
	public void inserirEditar(int op, ControleDados d, ViewPerfume p, int pos) {
		opcao = op;
		posicao = pos;
		dados = d;
		
		if (op == 1)
			s = "Cadastro de perfume";
		if (op == 2)
			s = "Detalhe de perfume";
		
		janela = new JFrame(s);
		
		if (op == 2) { // Mostrar dados cadastrados

			valorNomeProduto = new JTextField(dados.getModeloPerfume()[pos].getNomeProduto(), 200);
			valorLinhaProduto = new JTextField(dados.getModeloPerfume()[pos].getLinhaProduto(), 200);
			valorTamanho = new JTextField(String.valueOf(dados.getModeloPerfume()[pos].getTamanhoProduto()), 200);
			valorMarca = new JTextField(dados.getModeloPerfume()[pos].getMarcaProduto(), 200);
			valorPreco = new JTextField(String.valueOf(dados.getModeloPerfume()[pos].getPrecoProduto()), 200);
			valorGenero = new JTextField(dados.getModeloPerfume()[pos].getGeneroPerfume(), 200);
			valorFamilia = new JTextField(dados.getModeloPerfume()[pos].getFamiliaPerfume(), 200);
			valorSub = new JTextField(dados.getModeloPerfume()[pos].getSubPerfume(), 200);
			valorConsen = new JTextField(dados.getModeloPerfume()[pos].getConsenPerfume(), 200);
			
		}else { // Inserir dados
			valorNomeProduto = new JTextField(200); 
			valorLinhaProduto = new JTextField(200);
			valorTamanho = new JTextField(200);
			valorMarca = new JTextField(200);
			valorPreco = new JTextField(200);
			valorGenero = new JTextField(200);
			valorFamilia = new JTextField(200);
			valorSub = new JTextField(200);
			valorConsen = new JTextField(200);
			botaoSalvar.setBounds(245, 300, 115, 30);
		}
		
		labelNomeProduto.setBounds(30, 20, 150, 25);
		valorNomeProduto.setBounds(180, 20, 180, 25); 		
		labelLinhaProduto.setBounds(30, 50, 150, 25);
		valorLinhaProduto.setBounds(180, 50, 180, 25);		
		labelTamanho.setBounds(30, 80, 150, 25);
		valorTamanho.setBounds(180, 80, 180, 25);
		labelMarca.setBounds(30, 110, 150, 25);
		valorMarca.setBounds(180, 110, 180, 25);		
		labelPreco.setBounds(30, 140, 150, 25);
		valorPreco.setBounds(180, 140, 180, 25);		
		labelGenero.setBounds(30, 170, 150, 25);
		valorGenero.setBounds(180, 170, 180, 25);		
		labelFamilia.setBounds(30, 200, 150, 25);
		valorFamilia.setBounds(180, 200, 180, 25);		
		labelSub.setBounds(30, 230, 150, 25);
		valorSub.setBounds(180, 230, 180, 25);		
		labelConsen.setBounds(30, 260, 150, 25);
		valorConsen.setBounds(180, 260, 180, 25);
		
		if (op == 2) {
			botaoSalvar.setBounds(140, 300, 115, 30);
			botaoExcluir.setBounds(265, 300, 115, 30);
			this.janela.add(botaoExcluir);
		}
		
		this.janela.add(labelNomeProduto);
		this.janela.add(valorNomeProduto);
		this.janela.add(labelLinhaProduto);
		this.janela.add(valorLinhaProduto);
		this.janela.add(labelTamanho);
		this.janela.add(valorTamanho);
		this.janela.add(botaoSalvar);
		this.janela.add(labelMarca);
		this.janela.add(valorMarca);
		this.janela.add(labelPreco);
		this.janela.add(valorPreco);			
		this.janela.add(labelGenero);
		this.janela.add(valorGenero);
		this.janela.add(labelFamilia);
		this.janela.add(valorFamilia);
		this.janela.add(labelSub);
		this.janela.add(valorSub);
		this.janela.add(labelConsen);
		this.janela.add(valorConsen);
		
		this.janela.setLayout(null);

		this.janela.setSize(400, 400);
		janela.setLocationRelativeTo(null);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	/**
	 * Inserir dados
	 */
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res;
				if (opcao == 1) 
					novoDado[0] = Integer.toString(dados.getQtdPerfume());
				else
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorNomeProduto.getText();
				novoDado[2] = valorLinhaProduto.getText();
				novoDado[3] = valorTamanho.getText();
				novoDado[4] = valorMarca.getText();
				novoDado[5] = valorPreco.getText();
				novoDado[6] = valorGenero.getText();
				novoDado[7] = valorFamilia.getText();
				novoDado[8] = valorSub.getText();
				novoDado[9] = valorConsen.getText();

				res = dados.inserirEditarPerfumes(novoDado);

				if (res) {
					mensagemSucessoCadastro();
				} else
					mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if (src == botaoExcluir) {
			boolean res = false;

			if (opcao == 2) {
				res = dados.removerPerfumes(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusao();
			}

		}
		
	}	
	/**
	 * Mensagem que deve aparecer na tela
	 */
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	/**
	 * Mensagem que deve aparecer na tela 
	 */
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	/**
	 * Mensagem que deve aparecer na tela caso algo de errado
	 */
	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. Tamanho ou preço não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Mensagem que deve aparecer na tela caso algo de errado
	 */
	public void mensagemErroExclusao() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n " , null, 
				JOptionPane.ERROR_MESSAGE);
	}
		

}
