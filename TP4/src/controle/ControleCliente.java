package controle;

import modelo.*;

/**
 * Controla os dados do ModeloCliente
 * @author Ana Beatriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ControleCliente {
	
	private ModeloCliente[] client;
	private int qtdClientes;
	
	/**
	 * Importa os dados do cliente
	 * @param d importa valores da ControleCliente
	 */
	public ControleCliente(ControleDados d) {
		client = d.getModeloCliente();
		qtdClientes = d.getQtdCliente();
	}

	/**
	 * Método para listar os clientes
	 * @return s retorna o nome do cliente
	 */
	public String[] getNomeCliente() {
		String[] s = new String[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			s[i] = client[i].getNomeCliente();
		}
		return s;
	}
	
	//-------------Gets e Sets ---------------------
	
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
