package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.Algoritmos;

class tests {
	
	//Ejemplo de tests
	
	@BeforeAll
	static void setUp() {
	}
	
	@Test
	void Fibonacci() {
		int numEsperado = 5;
		int numObtenido = Algoritmos.fibonacci(5);
		assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void factorial() {
		int numEsperado = 120;
		int numObtenido = Algoritmos.factorial(5);
		assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void esPrimo() {
		boolean numEsperado = true;
		boolean numObtenido = Algoritmos.esPrimo(23);
		assertEquals(numEsperado,numObtenido);
	}
	
	/*
	 * @BeforeAll
	static void setUp() {
		
	}
	
	@Test
	void Sumatorio() {
		int numeroEsperado = 10;
		int numeroObtenido = Algoritmos.sumatorio(4);
		assertEquals(numeroEsperado,numeroObtenido);
	}
	 */

}
