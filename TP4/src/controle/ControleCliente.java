package controle;

import modelo.*;

public class ControleCliente {
	
	private ModeloCliente[] client;
	private int qtdClientes;
	
	public ControleCliente(ControleDados d) {
		client = d.getModeloCliente();
		qtdClientes = d.getQtdCliente();
	}

	public String[] getNomeCliente() {
		String[] s = new String[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			s[i] = client[i].getNomeCliente();
		}
		return s;
	}
	
	public int getQtd() {
		return qtdClientes;
	}

	public void setQtd(int qtd) {
		this.qtdClientes = qtd;
	}
	
	public String getNome(int i) {
		return client[i].getNomeCliente();
	}

	public String getEmail(int i) {
		return client[i].getEmailCliente();
	}

	public String getEndereco(int i) {
		return client[i].getEnderecoCliente();
	}
	
	public String getTelefone(int i) {
		return client[i].getTelefoneCliente();
	}
	
	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}


}
