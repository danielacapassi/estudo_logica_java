package exercicio25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercicio26.Exercicio26;

class Exercicio25Test {
	
	Exercicio25 exercicio = new Exercicio25();

	@Test
	void test() {
		assertEquals(20,exercicio.calcularSaldo(200, 80, 100));
		assertEquals(-70,exercicio.calcularSaldo(300,70,300));
	}

}
