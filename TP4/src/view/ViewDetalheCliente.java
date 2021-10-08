package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

/**
 * Classe que contem as informações da view
 * @author Ana Baetriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ViewDetalheCliente implements ActionListener {
	
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelEmail = new JLabel("Email: ");
	private JTextField valorEmail;
	private JLabel labelEnd = new JLabel("Endereco: ");
	private JTextField valorEnd;
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorTelefone;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	/**
	 * Método para inserir e/ou editar cliente
	 * @param op opção selecionada
	 * @param d importa valores da ControleDados
	 * @param v dados da ViewCliente 
	 * @param pos posição do cliente
	 */
	public void inserirEditar(int op, ControleDados d, ViewCliente v, int pos) {

		opcao = op;
		dados = d;
		posicao = pos;

		if (op == 1) s = "Cadastro de Cliente";
		if (op == 2) s = "Detalhe de Cliente";
		
		janela = new JFrame(s);

		if (op == 2) { // Mostrar dados cadastrados
			valorNome = new JTextField(dados.getModeloCliente()[pos].getNomeCliente(),200);
			valorEmail = new JTextField(dados.getModeloCliente()[pos].getEmailCliente(),200);
			valorEnd = new JTextField(dados.getModeloCliente()[pos].getEnderecoCliente(),200);
			valorTelefone = new JTextField(dados.getModeloCliente()[pos].getTelefoneCliente(),10);;			

		} else { // Inserir dados

			valorNome = new JTextField(200);
			valorEmail = new JTextField(200);
			valorEnd = new JTextField(200);
			valorTelefone = new JTextField(10);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEmail.setBounds(30, 50, 150, 25);
		valorEmail.setBounds(180, 50, 180, 25);
		labelEnd.setBounds(30, 80, 150, 25);
		valorEnd.setBounds(180, 80, 180, 25);
		labelTelefone.setBounds(30, 110, 150, 25);
		valorTelefone.setBounds(180, 110, 180, 25);
		
		
		if (op == 1) {
			this.janela.add(labelNome);
			this.janela.add(valorNome);
			this.janela.add(labelEmail);
			this.janela.add(valorEmail);
			this.janela.add(labelEnd);
			this.janela.add(valorEnd);
			this.janela.add(labelTelefone);
			this.janela.add(valorTelefone);
			this.janela.add(botaoSalvar);

		}

		if (op == 2) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelEmail);
		this.janela.add(valorEmail);
		this.janela.add(labelEnd);
		this.janela.add(valorEnd);
		this.janela.add(labelTelefone);
		this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
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
		
		if(src == botaoSalvar) {
			try {
				boolean res;
				if (opcao == 1)
					novoDado[0] = Integer.toString(dados.getQtdCliente());
				else 
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorEmail.getText();
				novoDado[4] =  valorTelefone.getText();			
				novoDado[3] =  valorEnd.getText();
				res = dados.inserirEditarClientes(novoDado);


				if(res) {
					mensagemSucessoCadastro();
				}
				else
					mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 2) {
				res = dados.removerCliente(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoCliente(); 
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
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. Telefone não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoCliente() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ", null, 
				JOptionPane.ERROR_MESSAGE);
	}
}
