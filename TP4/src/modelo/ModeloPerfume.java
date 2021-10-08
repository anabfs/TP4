package modelo;

/**
 * Classe que define os atributos e metodos do objeto
 * @author Ana Beatriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ModeloPerfume extends ModeloProduto {
	//-------------Atributos da classe----------------
	
	private String generoPerfume;
	private String familiaPerfume;
	private String subPerfume;
	private String consenPerfume;

	/**
	 * Construtor Perfume
	 * @param nomeProduto refente ao nome do perfume
	 * @param linhaProduto referente a linha do perfume
	 * @param tamanhoProduto referente ao tamanho do perfume em ml
	 * @param marcaProduto referente ao nome da marca do perfume
	 * @param precoProduto refente ao preço do perfume em reais
	 * @param generoPerfume referente ao genero indicativo do perfume
	 * @param familiaPerfume referente a familia olfativa do perfume
	 * @param subPerfume refente a sub familia olfativa do perfume
	 * @param consenPerfume refernte a consentração do perfume
	 */
	public ModeloPerfume(String nomeProduto, String linhaProduto, int tamanhoProduto, String marcaProduto, float precoProduto,
		String generoPerfume, String familiaPerfume, String subPerfume, String consenPerfume) {
		super(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto);
		this.generoPerfume = generoPerfume;
		this.familiaPerfume = familiaPerfume;
		this.subPerfume = subPerfume;
		this.consenPerfume = consenPerfume;
	}
	
	//-------------Gets e Sets ---------------------
	
	public String getGeneroPerfume() {
		return generoPerfume;
	}

	public void setGeneroPerfume(String generoPerfume) {
		this.generoPerfume = generoPerfume;
	}

	public String getFamiliaPerfume() {
		return familiaPerfume;
	}

	public void setFamiliaPerfume(String familiaPerfume) {
		this.familiaPerfume = familiaPerfume;
	}

	public String getSubPerfume() {
		return subPerfume;
	}

	public void setSubPerfume(String subPerfume) {
		this.subPerfume = subPerfume;
	}

	public String getConsenPerfume() {
		return consenPerfume;
	}

	public void setConsenPerfume(String consenPerfume) {
		this.consenPerfume = consenPerfume;
	}

	@Override
		public String toString() {
		return "Perfume \nNome: " + nomeProduto + "\nLinha: " + linhaProduto + "\nTamnho: " + tamanhoProduto 
				+ " ml\n"+ "\nMarca: " + marcaProduto + "\nPreco: R$ "
				+ precoProduto + "\nGenero indicado: " + generoPerfume + "\nFamilia olfativa: " + familiaPerfume
				+ "\nSub familia: " + subPerfume + "\nConsentracao: " + consenPerfume;
	}
}
