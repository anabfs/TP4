package controle;

import modelo.ModeloPerfume;

/**
 * Controla os dados do ModeloPerfume
 * @author Ana Beatriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ControlePerfume {
	
	private ModeloPerfume[] perfume;
	private int qtdPerfumes;

	/**
	 * Importa os dados do perfume
	 * @param d importa valores da ControlePerfume
	 */
	public ControlePerfume(ControleDados d) {
		perfume = d.getModeloPerfume();
		qtdPerfumes = d.getQtdPerfume();
	}

	/**
	 * Método para listar os perfumes
	 * @returns s retorna o nome do perfume
	 */
	public String[] getNomePerfume() {
		String[] s = new String[qtdPerfumes];
		for (int i = 0; i < qtdPerfumes; i++) {
			s[i] = perfume[i].getNomeProduto();
		}
		return s;
	}
	
	//-------------Gets e Sets ---------------------
	
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