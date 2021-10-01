package modelo;

public class ModeloHidratante extends ModeloProduto {
	private String familiaHidratante;
	private String tipoHidratante;
	private String descricaoHidratante;

	public ModeloHidratante(String nomeProduto, String linhaProduto, int tamanhoProduto, String marcaProduto, float precoProduto,
		String familiaHidratante, String tipoHidratante, String descricaoHidratante) {
		super(nomeProduto, linhaProduto, tamanhoProduto, marcaProduto, precoProduto);
		this.familiaHidratante = familiaHidratante;
		this.tipoHidratante = tipoHidratante;
		this.descricaoHidratante = descricaoHidratante;
	}
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
