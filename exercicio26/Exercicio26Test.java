package exercicio26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercicio24.Exercicio24;

class Exercicio26Test {
	
	Exercicio26 exercicio = new Exercicio26();


	@Test
	void testCalcularQuantidadeMedia() {
		assertEquals(40,exercicio.statusConta(38, 20, 60));
		assertEquals(40,exercicio.statusConta(70,20,60));
	}

}
