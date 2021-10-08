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

public class ViewDetalheHidratante implements ActionListener {
	
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
	private JLabel labelFamilia = new JLabel("Familia olfativa: ");
	private JTextField valorFamilia;
	private JLabel labelTipo = new JLabel("Tipo: ");
	private JTextField valorTipo;
	private JLabel labelDescricao = new JLabel("Descrição: ");
	private JTextField valorDescricao;
	
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;
	
	/**
	 * Método para inserir e/ou editar hidratante
	 * @param op opção selecionada
	 * @param d importa valores da ControleDados
	 * @param v dados da ViewHidratante
	 * @param pos posição do hidratante
	 */
	
	public void inserirEditar(int op, ControleDados d, ViewHidratante p, int pos) {
		opcao = op;
		posicao = pos;
		dados = d;
		
		if (op == 1)
			s = "Cadastro de hidratante";
		if (op == 2)
			s = "Detalhe de hidratante";
		
		janela = new JFrame(s);
		
		if(op == 2) { // Mostrar dados cadastrados
			valorNomeProduto = new JTextField(dados.getModeloHidratante()[pos].getNomeProduto(), 200);
			valorLinhaProduto = new JTextField(dados.getModeloHidratante()[pos].getLinhaProduto(), 200);
			valorTamanho = new JTextField(String.valueOf(dados.getModeloPerfume()[pos].getTamanhoProduto()), 200);
			valorMarca = new JTextField(dados.getModeloHidratante()[pos].getMarcaProduto(), 200);
			valorPreco = new JTextField(String.valueOf(dados.getModeloHidratante()[pos].getPrecoProduto()), 200);
			valorFamilia = new JTextField(dados.getModeloHidratante()[pos].getfamiliaHidratante(), 200);
			valorTipo = new JTextField(dados.getModeloHidratante()[pos].getTipoHidratante(), 200);
			valorDescricao = new JTextField(dados.getModeloHidratante()[pos].getdescricaoHidratante(), 200);
		}else { // Inserir dados
			valorNomeProduto = new JTextField(200); 
			valorLinhaProduto = new JTextField(200);
			valorTamanho = new JTextField(200);
			valorMarca = new JTextField(200);
			valorPreco = new JTextField(200);
			valorFamilia = new JTextField(200);
			valorTipo = new JTextField(200);
			valorDescricao = new JTextField(200);
			
			botaoSalvar.setBounds(245, 300, 115, 30);
		}
		
		labelNomeProduto.setBounds(30, 20, 150, 25);
		valorNomeProduto.setBounds(130, 20, 230, 25); 		
		labelLinhaProduto.setBounds(30, 50, 150, 25);
		valorLinhaProduto.setBounds(130, 50, 230, 25);		
		labelTamanho.setBounds(30, 80, 150, 25);
		valorTamanho.setBounds(130, 80, 230, 25); 		
		labelMarca.setBounds(30, 110, 150, 25);
		valorMarca.setBounds(130, 110, 230, 25);		
		labelPreco.setBounds(30, 140, 150, 25);
		valorPreco.setBounds(130, 140, 230, 25);		
		labelFamilia.setBounds(30, 170, 150, 25);
		valorFamilia.setBounds(130, 170, 230, 25);		
		labelTipo.setBounds(30, 200, 150, 25);
		valorTipo.setBounds(130, 200, 230, 25);	
		labelDescricao.setBounds(30, 230, 150, 25);
		valorDescricao.setBounds(130, 230, 230, 25);
		
		if(op == 2) {
			botaoSalvar.setBounds(100, 300, 115, 30);
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
		this.janela.add(labelFamilia);
		this.janela.add(valorFamilia);
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
					novoDado[0] = Integer.toString(dados.getQtdHidratante());
				else
					novoDado[0] = Integer.toString(posicao);
				
				novoDado[1] = valorNomeProduto.getText();
				novoDado[2] = valorLinhaProduto.getText();
				novoDado[3] = valorTamanho.getText();
				novoDado[4] = valorMarca.getText();
				novoDado[5] = valorPreco.getText();
				novoDado[6] = valorFamilia.getText();
				novoDado[7] = valorTipo.getText();
				novoDado[8] = valorDescricao.getText();
				
				res = dados.inserirEditarHidratantes(novoDado);
				
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
				res = dados.removerHidratantes(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoHidratante();
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


	public void mensagemErroExclusaoHidratante() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n ", 
				null ,JOptionPane.ERROR_MESSAGE);
	}
}
