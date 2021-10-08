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

public class ViewDetalheVenda implements ActionListener {
	
	private JFrame janela;
	private JLabel labelIDVenda = new JLabel("ID da venda: ");
	private JTextField valorIDVenda;
	private JLabel labelPrecoVenda = new JLabel("Preço total: ");
	private JTextField valorPrecoVenda;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	/**
	 * Método para inserir e/ou editar vendas
	 * @param op opção selecionada
	 * @param d importa valores da ControleDados
	 * @param v dados da ViewVendas
	 * @param pos posição da venda
	 */
	
	public void inserirEditar(int op, ControleDados d, ViewVenda p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Venda";
		if (op == 2)
			s = "Registro de Venda";

		janela = new JFrame(s);

		if (op == 2) { // Mostrar dados cadastrados

			valorIDVenda = new JTextField(String.valueOf(dados.getModeloVenda()[pos].getIDVenda()), 200);
			valorPrecoVenda = new JTextField(String.valueOf(dados.getModeloVenda()[pos].getPrecoVenda()), 200);

		} else { // Inserir dados

			valorIDVenda = new JTextField(200);
			valorPrecoVenda = new JTextField(200);

			botaoSalvar.setBounds(265, 240, 115, 30);
		}

		labelIDVenda.setBounds(30, 50, 150, 25);
		valorIDVenda.setBounds(180, 50, 200, 25);
		labelPrecoVenda.setBounds(30, 80, 150, 25);
		valorPrecoVenda.setBounds(180, 80, 200, 25);

		if (op == 2) {
			botaoSalvar.setBounds(140, 130, 115, 30);
			botaoExcluir.setBounds(265, 130, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelIDVenda);
		this.janela.add(valorIDVenda);
		this.janela.add(labelPrecoVenda);
		this.janela.add(valorPrecoVenda);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(450, 230);
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
					novoDado[0] = Integer.toString(dados.getQtdVenda());
				else
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorIDVenda.getText();
				novoDado[2] = valorPrecoVenda.getText();

				res = dados.inserirEditarVendas(novoDado);

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
				res = dados.removerVendas(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoVenda();
			}

		}
		
	}	public void mensagemSucessoExclusao() {
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
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, identidade, DDD e telefone não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoVenda() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o aluno está matriculado\n"
				+ "em alguma disciplina. Se sim, cancele\n "
				+ "a matricula e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
		

}
