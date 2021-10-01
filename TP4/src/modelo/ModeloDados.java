package modelo;

public class ModeloDados {
	
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
	
	
	
	public void inserirEditarPerfumes(ModeloPerfume perf, int pos) {
		this.perfumes[pos] = perf;
		if (pos == qtdPerfumes)
			qtdPerfumes++;
	}
	public void inserirEditarDesodorante(ModeloDesodorante des, int pos) {
		this.desodorantes[pos] = des;
		if (pos == qtdDesodorantes)
			qtdDesodorantes++;
	}
	public void inserirEditarHidratantes(ModeloHidratante hid, int pos) {
		this.hidratantes[pos] = hid;
		if (pos == qtdHidratantes)
			qtdHidratantes++;
	}
	public void inserirEditarVendas(ModeloVenda vend, int pos) {
		this.vendas[pos] = vend;
		if (pos == qtdVendas)
			qtdVendas++;
	}
	public void inserirEditarClientes(ModeloCliente client, int pos) {
		this.clientes[pos] = client;
		if (pos == qtdClientes)
			qtdClientes++;
	}
	
    public void preCadastro() {
    	clientes[0] = (new ModeloCliente("Ana", "ana@gmail.com", "Bras�lia", "61123456789"));
    	clientes[1] = (new ModeloCliente("Jefferson", "jefferson@gmail.com", "Gama", "61987654321"));

    	perfumes[0] = (new ModeloPerfume("ZAAD", "Santal", 95, "Zaad", (float) 249.90, "Masculino", "Amadeirado", "Amadeirado", "Eau de Parfum Eau de Cologne"));
    	perfumes[1] = (new ModeloPerfume("Elys�e Succ�s", "Succ�s", 50, "Elys�e", (float) 249.90, "Feminino", "Chimodelo Especiado", "Amadeirado", "Eau de Parfum"));

    	desodorantes[0] = (new ModeloDesodorante("Desodorante Antitranspirante Aerossol Floratta L'Amore", "L'Amore", 125, "Floratta", (float) 28.90, "Feminino", "Aerossol", "O Desodorante Antitranspirante Aerossol Floratta L�Amore tem duplo benef�cio, pois al�m de proteger as axilas dos maus odores da transpira��o por at� 48 horas, garante tamb�m a inibi��o da transpira��o. � mais liberdade para voc� aproveitar o dia."));
    	desodorantes[1] = (new ModeloDesodorante("Desodorante Antitranspirante Aerossol Malbec", "Tradicional", 125, "Malbec", (float) 29.90, "Masculino", "Aerossol", "O Malbec Desodorante Antitranspirante Aerosol oferece 48 horas de prote��o, mantendo a pele hidratada e perfumada. Com secagem r�pida e toque seco, o desodorante antitranspirante possui nova f�rmula com �leos essenciais e mentol que proporcionam uma sensa��o refrescante e perfuma��o intensiva. Sua v�lvula com �ngulo mais fechado ajuda na amplia��o de vaz�o e jato mais direcionado, devendo ser aplicado a 15cm de distancia."));
		
    	hidratantes[0] = (new ModeloHidratante("Lo��o Nutritiva Corporal Nativa Spa Org�nico", "Org�nico", 400, "Nativa SPA", (float) 76.90, "N�o informado", "Todos os tipos", "Enriquecida com ingredientes nutritivos e hidratantes, a Lo��o Nutritiva Corporal Nativa Spa Org�nico melhora a sa�de da pele. Sua f�rmula traz ingredientes naturais cuidadosamente selecionados da agricultura org�nica e livres de componentes qu�micos agressivos."));
    	hidratantes[1] = (new ModeloHidratante("�leo Hidratante Desodorante Corporal Nativa SPA Ameixa", "Ameixa", 200, "Nativa SPA", (float) 64.90, "Floriental Ambarada", "Todos os tipos", "Oferecendo hidrata��o profunda, aumento na produ��o de col�geno e modeloven��o da perda de elasticidade da pele, o �leo Desodorante Hidratante Corporal Nativa SPA Ameixa n�o pode faltar na sua rotina de cuidados pessoais. Al�m das propriedades hidratantes e nutritivas do extrato de Ameixa, a sua f�rmula desenvolvida com �leo 100% Vegetal, Extrato de Girassol e gotas purificadas de Quinoa, que devolvem a vitalidade da pele aumentando essa produ��o de Col�geno. O �leo hidratante potencializa a hidrata��o e desodoriza��o da pele."));

    	vendas[0] = new ModeloVenda("1", (float) 249.90);
    	vendas[1] = (new ModeloVenda("2", (float) 76.90));
    	
    	qtdClientes = 2;
    	qtdPerfumes = 2;
    	qtdDesodorantes = 2;
    	qtdHidratantes = 2;
    	qtdVendas = 2;
    }
}
