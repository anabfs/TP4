package controle;

import modelo.ModeloDesodorante;

public class ControleDesodorante {
	
	private ModeloDesodorante[] deso;
	private int qtdDesodorante;

	public ControleDesodorante(ControleDados d) {
		deso = d.getModeloDesodorante();
		qtdDesodorante = d.getQtdDesodorante();
	}

	public String[] getNomeDesodorante() {
		String[] s = new String[qtdDesodorante];
		for (int i = 0; i < qtdDesodorante; i++) {
			s[i] = "" + deso[i].getNomeProduto();
		}
		return s;
	}

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
