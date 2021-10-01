package controle;

import modelo.ModeloPerfume;

public class ControlePerfume {
	
	private ModeloPerfume[] perfume;
	private int qtdPerfumes;

	public ControlePerfume(ControleDados d) {
		perfume = d.getModeloPerfume();
		qtdPerfumes = d.getQtdPerfume();
	}

	public String[] getNomePerfume() {
		String[] s = new String[qtdPerfumes];
		for (int i = 0; i < qtdPerfumes; i++) {
			s[i] = "" + perfume[i].getNomeProduto();
		}
		return s;
	}
	
	public int getQtd() {
		return qtdPerfumes;
	}

	public void setQtd(int qtd) {
		this.qtdPerfumes = qtd;
	}
	public String getNome(int i) {
		return perfume[i].getNomeProduto();
	}
	public String getLinha(int i) {
		return perfume[i].getLinhaProduto();
	}
	public int getTamanho(int i) {
		return perfume[i].getTamanhoProduto();
	}
	public String getMarca(int i) {
		return perfume[i].getMarcaProduto();
	}
	public float getPreco(int i) {
		return perfume[i].getPrecoProduto();
	}
	public String getGenero(int i) {
		return perfume[i].getGeneroPerfume();
	}
	public String getFamilia(int i) {
		return perfume[i].getFamiliaPerfume();
	}
	public String getSub(int i) {
		return perfume[i].getSubPerfume();
	}
	public String getConsen(int i) {
		return perfume[i].getConsenPerfume();
	}

}