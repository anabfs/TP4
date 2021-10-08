package controle;

import modelo.ModeloDesodorante;

/**
 * Controla os dados do ModeloDesodorante
 * @author Ana Beatriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ControleDesodorante {
	
	private ModeloDesodorante[] deso;
	private int qtdDesodorante;

	/**
	 * Importa os dados do dosodorante
	 * @param d importa valores da ControleDesodorante
	 */
	public ControleDesodorante(ControleDados d) {
		deso = d.getModeloDesodorante();
		qtdDesodorante = d.getQtdDesodorante();
	}

	/**
	 * Método para listar os desodorante
	 * @return s retorna o nome do desodorante
	 */
	public String[] getNomeDesodorante() {
		String[] s = new String[qtdDesodorante];
		for (int i = 0; i < qtdDesodorante; i++) {
			s[i] = deso[i].getNomeProduto();
		}
		return s;
	}

	//-------------Gets e Sets ---------------------
	
	public int getQtd() {
		return qtdDesodorante;
	}

	public void setQtd(int qtd) {
		this.qtdDesodorante = qtd;
	}
	public String getNome(int i) {
		return deso[i].getNomeProduto();
	}
	public String getLinha(int i) {
		return deso[i].getLinhaProduto();
	}
	public int getTamanho(int i) {
		return deso[i].getTamanhoProduto();
	}
	public String getMarca(int i) {
		return deso[i].getMarcaProduto();
	}
	public float getPreco(int i) {
		return deso[i].getPrecoProduto();
	}
	public String getGenero(int i) {
		return deso[i].getGeneroDesodorante();
	}
	public String getTipo(int i) {
		return deso[i].getTipoDesodorante();
	}
	public String getDescriacao(int i) {
		return deso[i].getdescricaoDesodorante();
	}
	
}
