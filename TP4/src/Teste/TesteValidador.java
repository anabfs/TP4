package Teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import controle.*;
/**
 * Testes de validação
 * @author Ana Baetriz Santos e Jefferson França
 * @version 1.0 (Out 2021)
 */

class TesteValidador {
	Validador v = new Validador();

	/**
	 * Testando alguns email
	 */
	@Test
	void testValidaEmail() {
		assertTrue(v.validaEmail("ana@unb.com"));
		assertFalse(v.validaEmail("@jeff.unb.com"));
		assertFalse(v.validaEmail("ana.unb.com"));
		assertFalse(v.validaEmail(""));
	}

	/**
	 * Testando alguns telefones
	 */
	@Test
	void testValidaTelefone() {
		assertTrue(v.validaTelefone("61912345678"));
		assertFalse(v.validaTelefone("1234"));
		assertFalse(v.validaTelefone("00000000000"));
		assertFalse(v.validaTelefone("1234567890a"));
	}
}
