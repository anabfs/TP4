package controle;

import modelo.ModeloHidratante;

public class ControleHidratante {

	private ModeloHidratante[] hidra;
	private int qtdHidratante;
	
	public ControleHidratante(ControleDados d) {
		hidra = d.getModeloHidratante();
		qtdHidratante = d.getQtdHidratante();
	}

	public String[] getNomeHidratante() {
		String[] s = new String[qtdHidratante];
		for (int i = 0; i < qtdHidratante; i++) {
			s[i] = hidra[i].getNomeProduto();
		}
		return s;
	}
	
	public int getQtd() {
		return qtdHidratante;
	}

	public void setQtd(int qtd) {
		this.qtdHidratante = qtd;
	}
	public String getNome(int i) {
		return hidra[i].getNomeProduto();
	}
	public String getLinha(int i) {
		return hidra[i].getLinhaProduto();
	}
	public int getTamanho(int i) {
		return hidra[i].getTamanhoProduto();
	}
	public String getMarca(int i) {
		return hidra[i].getMarcaProduto();
	}
	public float getPreco(int i) {
		return hidra[i].getPrecoProduto();
	}
	public String getFamilia(int i) {
		return hidra[i].getfamiliaHidratante();
	}
	public String getTipo(int i) {
		return hidra[i].getTipoHidratante();
	}
	public String getDescricao(int i) {
		return hidra[i].getTipoHidratante();
	}
	
}
