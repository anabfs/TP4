package modelo;

/**
 * Classe que define os atributos e metodos do objeto
 * @author Ana Beatriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ModeloProduto {
	//-------------Atributos da classe----------------
	protected String nomeProduto;
	protected String linhaProduto;
	protected int tamanhoProduto;
	protected String marcaProduto;
	protected float precoProduto;
	
	/**
	 * Construtor Produto
	 * @param nomeProduto referente ao nome do produto
	 * @param linhaProduto referente a linha do produto
	 * @param tamanhoProduto referente ao tamanho do produto em ml
	 * @param marcaProduto referente ao nome da marca do produto
	 * @param precoProduto referente ao preço em reais
	 */
	public ModeloProduto(String nomeProduto, String linhaProduto, int tamanhoProduto, String marcaProduto, float precoProduto) {
		this.nomeProduto = nomeProduto;
		this.linhaProduto = linhaProduto;
		this.tamanhoProduto = tamanhoProduto;
		this.marcaProduto = marcaProduto;
		this.precoProduto = precoProduto;
	}

	//-------------Gets e Sets ---------------------
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public String getLinhaProduto() {
		return linhaProduto;
	}

	public void setLinhaProduto(String linhaProduto) {
		this.linhaProduto = linhaProduto;
	}

	public int getTamanhoProduto() {
		return tamanhoProduto;
	}

	public void setTamanhoProduto(int tamanhoProduto) {
		this.tamanhoProduto = tamanhoProduto;
	}	

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}	
	
	public float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}
}
