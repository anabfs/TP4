package controle;

import modelo.ModeloVenda;

public class ControleVenda {
	private ModeloVenda[] venda;
	private int qtdVendas;

    public ControleVenda(ControleDados d) {
    	venda = d.getModeloVenda();
		qtdVendas = d.getQtdVenda();
    }
	
	public String[] getIDVenda() {
		String[] s = new String[qtdVendas];
		for (int i = 0; i < qtdVendas; i++) {

			s[i] = venda[i].getIDVenda();
		}
		return s;
    }
	
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
