package modelo;

/**
 * Classe que define os atributos e metodos do objeto
 * @author Ana Baetriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

public class ModeloCliente {
	//-------------Atributos da classe----------------

	private String nomeCliente;
	private String emailCliente;
    private String enderecoCliente;    
    private String telefoneCliente; 
    
    /**
     * Construtor Cliente
     * @param nomeCliente refere-se ao nome do cliente.
     * @param emailCliente refere-se ao email do cliente.
     * @param enderecoCliente refere-se ao endereco do cliente
     * @param telefoneCliente refere-se ao  telefone do cliente
     */
    public ModeloCliente(String nomeCliente, String emailCliente, String enderecoCliente, String telefoneCliente) {
    	this.nomeCliente = nomeCliente;
    	this.emailCliente = emailCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
    }
    //-------------Gets e Sets ---------------------
    
    public String getNomeCliente() {
        return nomeCliente;
    }
 
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }


    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }


    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
    
    @Override
    public String toString() {
        return "Cliente \nNome: " + nomeCliente + "\nEmail: " + emailCliente + "\nEndereco: " + enderecoCliente 
                + "\nTelefone: " + telefoneCliente + "\n";
    }   
}
