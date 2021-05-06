package exercicio24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercicio23.Exercicio23;

class Exercicio24Test {
	
	Exercicio24 exercicio = new Exercicio24();

	@Test
	void testCalcularSalarioTotal() {
		assertEquals(1075.05,exercicio.calcularSalario(1000,1501));
		assertEquals(1042.0,exercicio.calcularSalario(1000,1400));
	}

}
