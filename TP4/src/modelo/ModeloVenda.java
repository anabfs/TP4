package modelo;

public class ModeloVenda {

    private String IDVenda;
    private ModeloProduto produtoVenda;
    private float precoVenda;
    private int qtdVendas;

    public ModeloVenda(String idvenda, float precoVenda) {
        this.IDVenda = idvenda;
        this.produtoVenda = produtoVenda;
        this.precoVenda = precoVenda;
    }

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
