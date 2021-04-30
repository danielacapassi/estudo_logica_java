package exercicio23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercicio23Test {

	Exercicio23 exercicio = new Exercicio23();
	
	@Test
	void testCalcularPesoIdeal() {
		assertEquals(80.130,exercicio.calcularPesoIdeal("Paulo", 1.90, 'M'));
		assertEquals(59.628,exercicio.calcularPesoIdeal("Joana", 1.68, 'F'));
		assertEquals(-1,exercicio.calcularPesoIdeal("Joana", 1.68, 'g'));
	}
	
	@Test
	void testValidaSexo() {
		assertTrue(exercicio.validaSexo('f'));
		assertTrue(exercicio.validaSexo('F'));
		assertTrue(exercicio.validaSexo('m'));
		assertTrue(exercicio.validaSexo('M'));
		assertFalse(exercicio.validaSexo(' '));
		assertFalse(exercicio.validaSexo('b'));
		assertFalse(exercicio.validaSexo('B'));
	}
	

}
