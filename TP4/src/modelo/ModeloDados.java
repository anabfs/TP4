package modelo;

/**
 * Classe que define os atributos e metodos do objeto
 * @author Ana Beatriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ModeloDados {
	//-------------Atributos da classe----------------
	
	private  ModeloPerfume[] perfumes = new ModeloPerfume[50];
	private  ModeloDesodorante[] desodorantes = new ModeloDesodorante[50];
	private  ModeloHidratante[] hidratantes = new ModeloHidratante[50];
	private  ModeloVenda[] vendas = new ModeloVenda[50];
	private  ModeloCliente[] clientes = new ModeloCliente[50];
	
	private int qtdPerfumes = 0;
	private int qtdDesodorantes = 0;
	private int qtdHidratantes = 0;
	private int qtdVendas = 0;
	private int qtdClientes = 0;
	
	//-------------Gets e Sets ---------------------
	
    public ModeloPerfume[] getPerfume() {
        return perfumes;
    }
    public void setPerfume(ModeloPerfume[] perfume) {
        this.perfumes = perfume;
    }
    
    public ModeloDesodorante[] getDesodorante() {
        return desodorantes;
    }
    public void setDesodorante(ModeloDesodorante[] desodorante) {
        this.desodorantes = desodorante;
    }
    
    public ModeloHidratante[] getHidratante() {
        return hidratantes;
    }
    public void setHidratante(ModeloHidratante[] hidratante) {
        this.hidratantes = hidratante;
    }
    
    public ModeloVenda[] getVenda() {
        return vendas;
    }
    public void setVenda(ModeloVenda[] venda) {
        this.vendas = venda;
    }
    public ModeloCliente[] getCliente() {
        return clientes;
    }
    public void setCliente(ModeloCliente[] cliente) {
        this.clientes = cliente;
    }
    
    
	public int getQtdPerfumes() {
		return qtdPerfumes;
	}
	public void setQtdPerfumes(int qtdPerfumes) {
		this.qtdPerfumes = qtdPerfumes;
	}
	
	public int getQtdDesodorantes() {
		return qtdDesodorantes;
	}
	public void setQtdDesodorantes(int qtdDesodorantes) {
		this.qtdDesodorantes = qtdDesodorantes;
	}
	
	public int getQtdHidratantes() {
		return qtdHidratantes;
	}
	public void setQtdHidratantes(int qtdHidratantes) {
		this.qtdHidratantes = qtdHidratantes;
	}
	
	public int getQtdVendas() {
		return qtdVendas;
	}
	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
	
	public int getQtdClientes() {
		return qtdClientes;
	}
	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}
	
	
	/**
	 * Método para inserir e/ou editar um perfume
	 * @param perf refere-se a classe ModeloPerfume
	 * @param pos variavel que informa a posicao do cliente
	 */
	public void inserirEditarPerfumes(ModeloPerfume perf, int pos) {
		this.perfumes[pos] = perf;
		if (pos == qtdPerfumes)
			qtdPerfumes++;
	}
	
	/**
	 * Método para inserir e/ou editar um desodorante
	 * @param des refere-se a classe ModeloDesodorante
	 * @param pos variavel que informa a posicao do desodorante
	 */
	public void inserirEditarDesodorante(ModeloDesodorante des, int pos) {
		this.desodorantes[pos] = des;
		if (pos == qtdDesodorantes)
			qtdDesodorantes++;
	}
	
	/**
	 * Método para inserir e/ou editar um hidratante
	 * @param hid refere-se a classe ModeloHidratantes
	 * @param pos variavel que informa a posicao do hidratante
	 */
	public void inserirEditarHidratantes(ModeloHidratante hid, int pos) {
		this.hidratantes[pos] = hid;
		if (pos == qtdHidratantes)
			qtdHidratantes++;
	}
	
	/**
	 * Método para inserir e/ou editar uma venda
	 * @param vend refere-se a classe ModeloVenda
	 * @param pos variavel que informa a posicao da venda
	 */
	public void inserirEditarVendas(ModeloVenda vend, int pos) {
		this.vendas[pos] = vend;
		if (pos == qtdVendas)
			qtdVendas++;
	}
	
	/**
	 * Método para inserir e/ou editar um cliente
	 * @param client refere-se a classe ModeloCliente
	 * @param pos variavel que informa a posicao do cliente
	 */
	public void inserirEditarClientes(ModeloCliente client, int pos) {
		this.clientes[pos] = client;
		if (pos == qtdClientes)
			qtdClientes++;
	}
	
	/**
	 * Dados pré cadastrados no banco de dados.
	 */
    public void preCadastro() {
    	clientes[0] = (new ModeloCliente("Ana", "ana@gmail.com", "Brasília", "61123456789"));
    	clientes[1] = (new ModeloCliente("Jefferson", "jefferson@gmail.com", "Gama", "61987654321"));

    	perfumes[0] = (new ModeloPerfume("ZAAD", "Santal", 95, "Zaad", (float) 249.90, "Masculino", "Amadeirado", "Amadeirado", "Eau de Parfum Eau de Cologne"));
    	perfumes[1] = (new ModeloPerfume("Elysée Succés", "Succés", 50, "Elysée", (float) 249.90, "Feminino", "Chimodelo Especiado", "Amadeirado", "Eau de Parfum"));

    	desodorantes[0] = (new ModeloDesodorante("Desodorante Antitranspirante Floratta L'Amore", "L'Amore", 125, "Floratta", (float) 28.90, "Feminino", "Aerossol", "O Desodorante Antitranspirante Aerossol Floratta L’Amore tem duplo benefício, pois além de proteger as axilas dos maus odores da transpiração por até 48 horas, garante também a inibição da transpiração. É mais liberdade para você aproveitar o dia."));
    	desodorantes[1] = (new ModeloDesodorante("Desodorante Antitranspirante Malbec", "Tradicional", 125, "Malbec", (float) 29.90, "Masculino", "Aerossol", "O Malbec Desodorante Antitranspirante Aerosol oferece 48 horas de proteção, mantendo a pele hidratada e perfumada. Com secagem rápida e toque seco, o desodorante antitranspirante possui nova fórmula com óleos essenciais e mentol que proporcionam uma sensação refrescante e perfumação intensiva. Sua válvula com ângulo mais fechado ajuda na ampliação de vazão e jato mais direcionado, devendo ser aplicado a 15cm de distancia."));
		
    	hidratantes[0] = (new ModeloHidratante("Loção Nativa Spa Orgânico", "Orgânico", 400, "Nativa SPA", (float) 76.90, "Não informado", "Loção Corporal", "Enriquecida com ingredientes nutritivos e hidratantes, a Loção Nutritiva Corporal Nativa Spa Orgânico melhora a saúde da pele. Sua fórmula traz ingredientes naturais cuidadosamente selecionados da agricultura orgânica e livres de componentes químicos agressivos."));
    	hidratantes[1] = (new ModeloHidratante("Óleo Nativa SPA Ameixa", "Ameixa", 200, "Nativa SPA", (float) 64.90, "Floriental Ambarada", "Óleo hidratante", "Oferecendo hidratação profunda, aumento na produção de colágeno e modelovenção da perda de elasticidade da pele, o Óleo Desodorante Hidratante Corporal Nativa SPA Ameixa não pode faltar na sua rotina de cuidados pessoais. Além das propriedades hidratantes e nutritivas do extrato de Ameixa, a sua fórmula desenvolvida com Óleo 100% Vegetal, Extrato de Girassol e gotas purificadas de Quinoa, que devolvem a vitalidade da pele aumentando essa produção de Colágeno. O óleo hidratante potencializa a hidratação e desodorização da pele."));

    	vendas[0] = new ModeloVenda("1", (float) 249.90);
    	vendas[1] = (new ModeloVenda("2", (float) 76.90));
    	
    	qtdClientes = 2;
    	qtdPerfumes = 2;
    	qtdDesodorantes = 2;
    	qtdHidratantes = 2;
    	qtdVendas = 2;
    }
}
