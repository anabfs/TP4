package modelo;

/**
 * Classe que define os atributos e metodos do objeto
 * @author Ana Beatriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ModeloHidratante extends ModeloProduto {
	//-------------Atributos da classe----------------
	
	private String familiaHidratante;
	private String tipoHidratante;
	private String descricaoHidratante;

	/**
	 * Contrutor Hidratante
	 * @param nomeProduto referente ao nome do hidratante
	 * @param linhaProduto referente a linha do hidratante
	 * @param tamanhoProduto referente ao tamanho do produto em ml
	 * @param marcaProduto referente ao nome da marca do hidratante
	 * @param precoProduto referente ao preço do produto em reais
	 * @param familiaHidratante referente a familia olfativa do hidratante
	 * @param tipoHidratante referente ao tipo de hidratante
	 * @param descricaoHidratante referente a descrição do hidratante
	 */
	public ModeloHidratante(String nomeProduto, String linhaProduto, int tamanhoProduto, String marcaProduto, float precoProduto,
		String familiaHidratante, String tipoHidratante, String descricaoHidratante) {
		super(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto);
		this.familiaHidratante = familiaHidratante;
		this.tipoHidratante = tipoHidratante;
		this.descricaoHidratante = descricaoHidratante;
	}
	
	//-------------Gets e Sets ---------------------
	
	public String getfamiliaHidratante() {
		return familiaHidratante;
	}

	public void setfamiliaHidratante(String familiaHidratante) {
		this.familiaHidratante = familiaHidratante;
	}

	public String getTipoHidratante() {
		return tipoHidratante;
	}

	public void setTipoHidratante(String tipoHidratante) {
		this.tipoHidratante = tipoHidratante;
	}

	public String getdescricaoHidratante() {
		return descricaoHidratante;
	}

	public void setdescricaoHidratante(String descricaoHidratante) {
		this.descricaoHidratante = descricaoHidratante;
	}


	@Override
		public String toString() {
		return "Hidratante\nNome: " + nomeProduto + "\nLinha: " + linhaProduto + "\nTamanho: " 
		+ tamanhoProduto + " ml\n"+ "\nMarca: " + marcaProduto + "\nPreco: R$ "	+ precoProduto 
		+ "\nFamilia olfativa: " + familiaHidratante + "\nTipo: " + tipoHidratante
		+ "\nDescricao: " + descricaoHidratante;
	}
}
