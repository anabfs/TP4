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

public class ViewDetalheDesodorante implements ActionListener {
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
	private JLabel labelTipo = new JLabel("Tipo: ");
	private JTextField valorTipo;
	private JLabel labelDescricao = new JLabel("Descricao: ");
	private JTextField valorDescricao;
	
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;
	
	/**
	 * Método para inserir e/ou editar desodorantes
	 * @param op opção selecionada
	 * @param d importa valores da ControleDados
	 * @param v dados da ViewDesodorante
	 * @param pos posição do desodorante
	 */
	
	public void inserirEditar(int op, ControleDados d, ViewDesodorante p, int pos) {
		opcao = op;
		posicao = pos;
		dados = d;
		
		if (op == 1)
			s = "Cadastro de desodorante";
		if (op == 2)
			s = "Detalhe de desodorante";
		
		janela = new JFrame(s);
		
		if(op == 2) { // Mostrar dados cadastrados
			valorNomeProduto = new JTextField(dados.getModeloDesodorante()[pos].getNomeProduto(), 200);
			valorLinhaProduto = new JTextField(dados.getModeloDesodorante()[pos].getLinhaProduto(), 200);
			valorTamanho = new JTextField(String.valueOf(dados.getModeloPerfume()[pos].getTamanhoProduto()), 200);
			valorMarca = new JTextField(dados.getModeloDesodorante()[pos].getMarcaProduto(), 200);
			valorPreco = new JTextField(String.valueOf(dados.getModeloDesodorante()[pos].getPrecoProduto()), 200);
			valorGenero = new JTextField(dados.getModeloDesodorante()[pos].getGeneroDesodorante(), 200);
			valorTipo = new JTextField(dados.getModeloDesodorante()[pos].getTipoDesodorante(), 200);
			valorDescricao = new JTextField(dados.getModeloDesodorante()[pos].getdescricaoDesodorante(), 1200);
		}else { // Inserir dados
			valorNomeProduto = new JTextField(200); 
			valorLinhaProduto = new JTextField(200);
			valorTamanho = new JTextField(200);
			valorMarca = new JTextField(200);
			valorPreco = new JTextField(200);
			valorGenero = new JTextField(200);
			valorTipo = new JTextField(200);
			valorDescricao = new JTextField(1200);
			
			botaoSalvar.setBounds(245, 300, 115, 30);
		}
		labelNomeProduto.setBounds(30, 20, 150, 25);
		valorNomeProduto.setBounds(100, 20, 260, 25); 	
		labelLinhaProduto.setBounds(30, 50, 150, 25);
		valorLinhaProduto.setBounds(100, 50, 260, 25);	
		labelTamanho.setBounds(30, 80, 150, 25);
		valorTamanho.setBounds(100, 80, 260, 25); 	
		labelMarca.setBounds(30, 110, 150, 25);
		valorMarca.setBounds(100, 110, 260, 25);		
		labelPreco.setBounds(30, 140, 150, 25);
		valorPreco.setBounds(100, 140, 260, 25);		
		labelGenero.setBounds(30, 170, 150, 25);
		valorGenero.setBounds(100, 170, 260, 25);		
		labelTipo.setBounds(30, 200, 150, 25);
		valorTipo.setBounds(100, 200, 260, 25);		
		labelDescricao.setBounds(30, 230, 150, 25);
		valorDescricao.setBounds(100, 230, 260, 50);
		
		if(op == 2) {
			botaoSalvar.setBounds(120, 300, 115, 30);
			botaoExcluir.setBounds(240, 300, 115, 30);
			this.janela.add(botaoExcluir);
		}
		this.janela.add(labelNomeProduto);
		this.janela.add(valorNomeProduto);
		this.janela.add(labelLinhaProduto);
		this.janela.add(valorLinhaProduto);
		this.janela.add(labelTamanho);
		this.janela.add(valorTamanho);
		this.janela.add(labelMarca);
		this.janela.add(valorMarca);
		this.janela.add(labelPreco);
		this.janela.add(valorPreco);	
		this.janela.add(labelGenero);
		this.janela.add(valorGenero);
		this.janela.add(labelTipo);
		this.janela.add(valorTipo);
		this.janela.add(labelDescricao);
		this.janela.add(valorDescricao);
		this.janela.add(botaoSalvar);
		
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
					novoDado[0] = Integer.toString(dados.getQtdDesodorante());
				else
					novoDado[0] = Integer.toString(posicao);
				
				novoDado[1] = valorNomeProduto.getText();
				novoDado[2] = valorLinhaProduto.getText();
				novoDado[3] = valorTamanho.getText();
				novoDado[4] = valorMarca.getText();
				novoDado[5] = valorPreco.getText();
				novoDado[6] = valorGenero.getText();
				novoDado[7] = valorTipo.getText();
				novoDado[8] = valorDescricao.getText();
				
				res = dados.inserirEditarDesodorantes(novoDado);
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
				res = dados.removerDesodorantes(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoDesodorante();
			}

		}
	}
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos dois erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos \n"
						+ "2. Tamanho ou preço não contém apenas números",
				null, JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoDesodorante() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n ", 
				null, JOptionPane.ERROR_MESSAGE);
	}
}
