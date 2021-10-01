package modelo;

public class ModeloCliente {
	private String nomeCliente;
	private String emailCliente;
    private String enderecoCliente;    
    private String telefoneCliente; 
    
    public ModeloCliente(String nomeCliente, String emailCliente, String enderecoCliente, String telefoneCliente) {
    	this.nomeCliente = nomeCliente;
    	this.emailCliente = emailCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
    }
    
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
