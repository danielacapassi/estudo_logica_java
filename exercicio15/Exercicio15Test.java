package exercicio15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercicio15Test {

	@Test
	void testVerificarTipo() {
		assertEquals("Esse n�mero � positivo",Exercicio15.verificarTipo(100f));
	}
	
	@Test
	void testVerificarTipo_negativo() {
		assertEquals("Esse n�mero � negativo",Exercicio15.verificarTipo(-100f));
	}

}
