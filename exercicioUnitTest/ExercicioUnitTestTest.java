package exercicioUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExercicioUnitTestTest {

	@Test
	void testVerificarPares() {
		assertTrue(ExercicioUnitTest.verificarPares(4, 2));
		assertTrue(ExercicioUnitTest.verificarPares(0, 2));
		assertTrue(ExercicioUnitTest.verificarPares(16, 4));
	}
	
	@Test
	void verificarImpares() {
		assertFalse(ExercicioUnitTest.verificarPares(4, 1));
	}
	
	

}
