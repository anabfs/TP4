package modelo;

public class ModeloDesodorante extends ModeloProduto {
	private String generoDesodorante;
	private String tipoDesodorante;
	private String descricaoDesodorante;

	public ModeloDesodorante(String nomeProduto, String linhaProduto, int tamanhoProduto, String marcaProduto, float precoProduto,
		String generoDesodorante, String tipoDesodorante, String descricaoDesodorante) {
		super(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto);
		this.generoDesodorante = generoDesodorante;
		this.tipoDesodorante = tipoDesodorante;
		this.descricaoDesodorante = descricaoDesodorante;
	}
	
	public String getGeneroDesodorante() {
		return generoDesodorante;
	}

	public void setGeneroDesodorante(String generoDesodorante) {
		this.generoDesodorante = generoDesodorante;
	}

	public String getTipoDesodorante() {
		return tipoDesodorante;
	}

	public void setTipoDesodorante(String tipoDesodorante) {
		this.tipoDesodorante = tipoDesodorante;
	}

	public String getdescricaoDesodorante() {
		return descricaoDesodorante;
	}

	public void setdescricaoDesodorante(String descricaoDesodorante) {
		this.descricaoDesodorante = descricaoDesodorante;
	}


	@Override
		public String toString() {
		return "Desodorante\nNome: " + nomeProduto + "\nLinha: " + linhaProduto+ " \nTamanho: " + tamanhoProduto 
				+ " ml\n"+ "\nMarca: " + marcaProduto + "\nPreco: R$ " + precoProduto + "\nGenero indicado: " 
				+ generoDesodorante + "\nTipo: " + tipoDesodorante + "\nDescricao: " + descricaoDesodorante;
	}
}
