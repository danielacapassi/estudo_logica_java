package exercicio22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercicio22Test {
	
	Exercicio22 exercicio = new Exercicio22();
	
	@Test
	void testCalcularSalario() {
		assertEquals(0.0f,exercicio.calcularSalario(0, 0));
		assertEquals(0.0f,exercicio.calcularSalario(100, 0));
		assertEquals(10000f,exercicio.calcularSalario(100, 100));
	}

	@Test
	void testTemHoraExtra() {
		assertTrue(exercicio.temHoraExtra(161));	
		assertFalse(exercicio.temHoraExtra(160));	
		assertFalse(exercicio.temHoraExtra(159));	
		assertFalse(exercicio.temHoraExtra(0));	
	}

}
