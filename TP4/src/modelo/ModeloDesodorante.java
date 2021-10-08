package modelo;

/**
 * Classe que define os atributos e metodos do objeto
 * @author Ana Beatriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ModeloDesodorante extends ModeloProduto {
	//-------------Atributos da classe----------------
	
	private String generoDesodorante;
	private String tipoDesodorante;
	private String descricaoDesodorante;

	/**
	 * Construtor Desodorante
	 * @param nomeProduto referente ao nome do desodorante
	 * @param linhaProduto referente a linha do desodorante
	 * @param tamanhoProduto referente ao tamanho do desodorante em ml
	 * @param marcaProduto referente ao nome da marca do desodorante
	 * @param precoProduto refernte ao preço do desodorante em reais
	 * @param generoDesodorante referente ao genero indicativo do desodorante
	 * @param tipoDesodorante referente ao tipo de desodorante
	 * @param descricaoDesodorante referente a descrição do desodorante
	 */
	public ModeloDesodorante(String nomeProduto, String linhaProduto, int tamanhoProduto, String marcaProduto, float precoProduto,
		String generoDesodorante, String tipoDesodorante, String descricaoDesodorante) {
		super(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto);
		this.generoDesodorante = generoDesodorante;
		this.tipoDesodorante = tipoDesodorante;
		this.descricaoDesodorante = descricaoDesodorante;
	}
	
	 //-------------Gets e Sets ---------------------
	
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
