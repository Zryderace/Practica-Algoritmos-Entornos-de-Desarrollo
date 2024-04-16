package app;

import java.util.ArrayList;

import Util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> resultadoFibonacci = new ArrayList<Integer>();		
		ArrayList<Integer> resultadoFactorial = new ArrayList<Integer>();
		ArrayList<Boolean> resultadoPrimos = new ArrayList<Boolean>();
		
		for (int i = 0; i < 5; i++) {
			numeros.add((int)(Math.random()*10)+1);
		}
		
		numeros.forEach((n)-> resultadoFibonacci.add(Algoritmos.fibonacci(n)));
		
		numeros.forEach((n)-> resultadoFactorial.add(Algoritmos.factorial(n)));
		
		numeros.forEach((n)-> resultadoPrimos.add(Algoritmos.esPrimo(n)));
		
	}

}
