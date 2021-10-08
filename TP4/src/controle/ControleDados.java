package controle;

import modelo.*;

/**
 * Controla os dados do ModeloDados
 * @author Ana Beatriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ControleDados {

	private ModeloDados d = new ModeloDados();
	
	public ControleDados() {
		d.preCadastro();
	}
	
	//-------------Gets e Sets ---------------------
	
	public ModeloDados getModeloDados() {
		return d;
	}
	public void setModeloDados(ModeloDados d) {
		this.d = d;
	}
	
	
	public ModeloPerfume[] getModeloPerfume() {
		return this.d.getPerfume();
	}
	public int getQtdPerfume() {
		return this.d.getQtdPerfumes();
	}
	
	public ModeloDesodorante[] getModeloDesodorante() {
		return this.d.getDesodorante();
	}
	public int getQtdDesodorante() {
		return this.d.getQtdDesodorantes();
	}
	
	public ModeloHidratante[] getModeloHidratante() {
		return this.d.getHidratante();
	}
	public int getQtdHidratante() {
		return this.d.getQtdHidratantes();
	}
	
	public ModeloVenda[] getModeloVenda() {
		return this.d.getVenda();
	}
	public int getQtdVenda() {
		return this.d.getQtdVendas();
	}
	
	public ModeloCliente[] getModeloCliente() {
		return this.d.getCliente();
	}
	public int getQtdCliente() {
		return this.d.getQtdClientes();
	}
	
	/**
	 * Valida os dados inserir e/ou editar um perfume
	 * @param dadosPerfume exporta os dados de um novo perfume
	 * @return true quando for autorizado a inserir e/ou editar um perfume
	 */
	
	public boolean inserirEditarPerfumes(String[] dadosPerfume) {

			ModeloPerfume p = new ModeloPerfume(dadosPerfume[1],dadosPerfume[2], Integer.parseInt(dadosPerfume[3]), dadosPerfume[4], Float.parseFloat(dadosPerfume[5]), dadosPerfume[6], dadosPerfume[7], dadosPerfume[8], dadosPerfume[9]);
			d.inserirEditarPerfumes(p, Integer.parseInt(dadosPerfume[0]));
			return true;
	}
	
	/*
	 * Método para remover um perfume
	 * @param i posição do perfume que vai ser removido
	 * @return true se o perfume foi removido com sucesso
	 */
	public boolean removerPerfumes(int i) {

		String perfumeRemovido = d.getPerfume()[i].getNomeProduto();

		if (i == (d.getQtdPerfumes() - 1)) { 
			d.setQtdPerfumes(d.getQtdPerfumes() - 1);
			d.getPerfume()[d.getQtdPerfumes()] = null;
			return true;
		} else { 
			int cont = 0;
			while (d.getPerfume()[cont].getNomeProduto().compareTo(perfumeRemovido) != 0) {
				cont++;
			}
			for (int j = cont; j < d.getQtdPerfumes() - 1; j++) {
				d.getPerfume()[j] = null;
				d.getPerfume()[j] = d.getPerfume()[j + 1];
			}
			d.getPerfume()[d.getQtdPerfumes()] = null;
			d.setQtdPerfumes(d.getQtdPerfumes() - 1);
			return true;
		}
	}
	
	/**
	 *  Valida os dados inserir e/ou editar um desodorante
	 * @param dadosDesodorante exporta os dados de um novo desodorante
	 * @return true quando for autorizado a inserir e/ou editar um desodorante
	 */
	
	public boolean inserirEditarDesodorantes(String[] dadosDesodorante) {

			ModeloDesodorante p = new ModeloDesodorante(dadosDesodorante[1],dadosDesodorante[2], Integer.parseInt(dadosDesodorante[3]), dadosDesodorante[4], Float.parseFloat(dadosDesodorante[5]), dadosDesodorante[6], dadosDesodorante[7], dadosDesodorante[8]);
			d.inserirEditarDesodorante(p, Integer.parseInt(dadosDesodorante[0]));
			return true;
		
	}

	/**
	 *  Método para remover um desodorante
	 * @param i posição do desodorante que vai ser removido
	 * @return true se o desodorante foi removido com sucesso
	 */
	public boolean removerDesodorantes(int i) {

		String desodoranteRemovido = d.getDesodorante()[i].getNomeProduto();

		if (i == (d.getQtdDesodorantes() - 1)) { 
			d.setQtdDesodorantes(d.getQtdDesodorantes() - 1);
			d.getDesodorante()[d.getQtdDesodorantes()] = null;
			return true;
		} else {
			int cont = 0;
			while (d.getDesodorante()[cont].getNomeProduto().compareTo(desodoranteRemovido) != 0) {
				cont++;
			}
			
			for (int j = cont; j < d.getQtdDesodorantes() - 1; j++) {
				d.getDesodorante()[j] = null;
				d.getDesodorante()[j] = d.getDesodorante()[j + 1];
			}
			d.getDesodorante()[d.getQtdDesodorantes()] = null;
			d.setQtdDesodorantes(d.getQtdDesodorantes() - 1);
			return true;
		}
	}
			 
	/**
	 * Valida os dados inserir e/ou editar um hidratante
	 * @param dadosHidratante exporta os dados de um novo hidratante
	 * @return true quando for autorizado a inserir e/ou editar um hidratante
	 */
	
	public boolean inserirEditarHidratantes(String[] dadosHidratante) {

			ModeloHidratante p = new ModeloHidratante(dadosHidratante[1],dadosHidratante[2], Integer.parseInt(dadosHidratante[3]), dadosHidratante[4], Float.parseFloat(dadosHidratante[5]), dadosHidratante[6], dadosHidratante[7], dadosHidratante[8]);
			d.inserirEditarHidratantes(p, Integer.parseInt(dadosHidratante[0]));
			return true;
		
	} 
			 
	/**
	 * Método para remover um hidratante
	 * @param i posição do hidratante que vai ser removido
	 * @return se o hidratante foi removido com sucesso
	 */
	
	public boolean removerHidratantes(int i) {

		String hidratanteRemovido = d.getHidratante()[i].getNomeProduto();

		if (i == (d.getQtdHidratantes() - 1)) { 
			d.setQtdHidratantes(d.getQtdHidratantes() - 1);
			d.getHidratante()[d.getQtdHidratantes()] = null;
			return true;
		} else {
			int cont = 0;
			while (d.getHidratante()[cont].getNomeProduto().compareTo(hidratanteRemovido) != 0) {
				cont++;
			}
			
			for (int j = cont; j < d.getQtdHidratantes() - 1; j++) {
				d.getHidratante()[j] = null;
				d.getHidratante()[j] = d.getHidratante()[j + 1];
			}
			d.getHidratante()[d.getQtdHidratantes()] = null;
			d.setQtdHidratantes(d.getQtdHidratantes() - 1);
			return true;
		}
	}

	/**
	 * Valida os dados inserir e/ou editar uma venda
	 * @param dadosVenda exporta os dados de uma nova venda
	 * @return true quando for autorizado a inserir e/ou editar uma venda
	 */
	public boolean inserirEditarVendas(String[] dadosVenda) {
			ModeloVenda p = new ModeloVenda(dadosVenda[1], Float.parseFloat(dadosVenda[2]));
			d.inserirEditarVendas(p, Integer.parseInt(dadosVenda[0]));
			return true;
		
	}
			 
	/**
	 * Método para remover uma venda
	 * @param i posição da venda que vai ser removido
	 * @return true se o perfume foi removido com sucesso
	 */
	public boolean removerVendas(int i) {

		String vendaRemovido = d.getVenda()[i].getIDVenda();

		if (i == (d.getQtdVendas() - 1)) {
			d.setQtdVendas(d.getQtdVendas() - 1);
			d.getCliente()[d.getQtdVendas()] = null;
			return true;
		} else { 
			int cont = 0;
			while (d.getCliente()[cont].getNomeCliente().compareTo(vendaRemovido) != 0) {
				cont++;
			}
			
			for (int j = cont; j < d.getQtdVendas() - 1; j++) {
				d.getVenda()[j] = null;
				d.getVenda()[j] = d.getVenda()[j + 1];
			}
			d.getVenda()[d.getQtdVendas()] = null;
			d.setQtdVendas(d.getQtdVendas() - 1);
			return true;
		}
	}
			 
	/**
	 * Valida os dados inserir e/ou editar um cliente
	 * @param dadosClientes exporta os dados de um novo cliente
	 * @return true quando for autorizado a inserir e/ou editar um cliente
	 */
	
	public boolean inserirEditarClientes(String[] dadosClientes) {		
		ModeloCliente cli = new ModeloCliente(dadosClientes[1], dadosClientes[2], dadosClientes[3], dadosClientes[4]);
		d.inserirEditarClientes(cli, Integer.parseInt(dadosClientes[0]));
		return true;
	}
			 
	/**
	 * Método para remover um cliente
	 * @param i posição do cliente que vai ser removido
	 * @return true se o perfume foi removido com sucesso
	 */
	
	public boolean removerCliente(int i) {

		String clienteRemovido = d.getCliente()[i].getNomeCliente();

		if (i == (d.getQtdClientes() - 1)) { 
			d.setQtdClientes(d.getQtdClientes() - 1);
			d.getCliente()[d.getQtdClientes()] = null;
			return true;
		} else { 
			int cont = 0;
			while (d.getCliente()[cont].getNomeCliente().compareTo(clienteRemovido) != 0) {
				cont++;
			}
		
			for (int j = cont; j < d.getQtdClientes() - 1; j++) {
				d.getCliente()[j] = null;
				d.getCliente()[j] = d.getCliente()[j + 1];
			}
			d.getCliente()[d.getQtdClientes()] = null;
			d.setQtdClientes(d.getQtdClientes() - 1);
			return true;
		}
	}
}
