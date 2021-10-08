package controle;

/**
 * Verificar se os dados informados estão no formato certo
 * @author Ana Beatriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */
public class Validador {

	/**
	 * Verifica se o email informado esta no formato certo
	 * @param email string do email 
	 * @return true se for valido ou false se não for
	 */
	public boolean validaEmail(String email) {
		boolean aux = true;
		if(email.isEmpty())
			aux = false;
		if(email.startsWith("@"))
			aux = false;
		if(!email.contains("@"))
			aux = false;
		
		return aux;
	}
	
	/**
	 * Verifica se o telefone informado esta no formato certo
	 * @param telefone string do telefone
	 * @return true se for valido ou false se não for
	 */
	public boolean validaTelefone(String telefone) {
		boolean aux = true;
		
		if(telefone.length() != 11)
			aux = false;
		if(telefone.replaceAll("[\\D]", "").length() != 11)
			aux = false;
		if(telefone.equals("00000000000") || telefone.equals("11111111111")
		|| telefone.equals("22222222222") || telefone.equals("33333333333")
	    || telefone.equals("44444444444") || telefone.equals("55555555555")
		|| telefone.equals("66666666666") || telefone.equals("77777777777")
		|| telefone.equals("88888888888") || telefone.equals("99999999999")) {
			aux = false;
		}
			
		
		return aux;
	}
}
