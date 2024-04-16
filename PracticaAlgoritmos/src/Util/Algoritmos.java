package Util;

public abstract class Algoritmos {

	/**
	 * Devuelve el numero Fibonacci de la posicion dada, int
	 * 
	 * @param numero del que queremos calcular su posicion en la sucesion Fibonacci
	 * @return entero existente en la posicion Fibonacci del numero dado
	 */
	
	public static int fibonacci(int numero) {
		
		int aux0 = 0;
		int aux1 = 1;
		int aux = 0;
		
		if(numero==0) {
			return 0;
		} else if (numero==1) {
			return 1;
		} else {
			
			for (int i = 0; i < numero; i++) {
				aux = aux0 + aux1;
				aux0 = aux1;
				aux1 = aux;
			}
			
		}
		return aux;
	}
	
	/**
	 * Devuelve el factorial del numero dado, int
	 * 
	 * @param numero del que queremos saber su factorial
	 * @return factorial del numero dado
	 */
	
	public static int factorial(int numero) {
		int aux = 1;
		
		if(numero==0) {
			return 0;
		} else {
			for (int i = 1; i <= numero; i++) {
				aux *= i;
			}
		}
		
		return aux;
	}
	
	
}
