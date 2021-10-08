package controle;

import modelo.ModeloVenda;

/**
 * Controla os dados do ModeloVenda
 * @author Ana Beatriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ControleVenda {
	private ModeloVenda[] venda;
	private int qtdVendas;

	/**
	 * Importa os dados da venda
	 * @param d importa valores da ControleVenda
	 */
    public ControleVenda(ControleDados d) {
    	venda = d.getModeloVenda();
		qtdVendas = d.getQtdVenda();
    }
	
    /**
	 * Método para listar as vendas
	 * @returns s retorna o número de identificação da venda
	 */
	public String[] getIDVenda() {
		String[] s = new String[qtdVendas];
		for (int i = 0; i < qtdVendas; i++) {

			s[i] = venda[i].getIDVenda();
		}
		return s;
    }
	
	//-------------Gets e Sets ---------------------
	
	public int getQtd() {
		return qtdVendas;
	}

	public void setQtd(int qtd) {
		this.qtdVendas = qtd;
	}

	public String getIDVenda(int i) {
		return venda[i].getIDVenda();
	}

	public float getValorFinal(int i) {
		return venda[i].getPrecoVenda();
	}

	public float getQtdVendas(int i) {
		return venda[i].getQtdVendas();
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
}
