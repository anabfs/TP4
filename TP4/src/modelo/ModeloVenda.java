package modelo;

/**
 * Classe que define os atributos e metodos do objeto
 * @author Ana Beatriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ModeloVenda {

	//-------------Atributos da classe----------------
	
    private String IDVenda;
    private ModeloProduto produtoVenda;
    private float precoVenda;
    private int qtdVendas;

    /**
     * Contrutor Venda
     * @param idvenda referete ao número de identificação da venda
     * @param precoVenda referente ao valor da venda
     */
    public ModeloVenda(String idvenda, float precoVenda) {
        this.IDVenda = idvenda;
        this.precoVenda = precoVenda;
    }

    //-------------Gets e Sets ---------------------
    
    public String getIDVenda() {
        return IDVenda;
    }

    public void setIDVenda(String IDVenda) {
        this.IDVenda = IDVenda;
    }
    
    public ModeloProduto getProdutoVenda() {
        return produtoVenda;
    }

    public void setProdutoVenda(ModeloProduto produtoVenda) {
        this.produtoVenda = produtoVenda;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
    
	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
    
    @Override
    public String toString() {
        return "Venda\n ID da venda: "+ IDVenda + "\nPreço total: " + precoVenda + " reais";
    }
}
