package modelo;

public class ModeloPerfume extends ModeloProduto {
	private String generoPerfume;
	private String familiaPerfume;
	private String subPerfume;
	private String consenPerfume;

	public ModeloPerfume(String nomeProduto, String linhaProduto, int tamanhoProduto, String marcaProduto, float precoProduto,
		String generoPerfume, String familiaPerfume, String subPerfume, String consenPerfume) {
		super(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto);
		this.generoPerfume = generoPerfume;
		this.familiaPerfume = familiaPerfume;
		this.subPerfume = subPerfume;
		this.consenPerfume = consenPerfume;
	}
	
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
