package eje04;

public class Ejercicio4 {

	public static boolean esPrimo (int num) {
		boolean esPrimo = true;
		int i = 2;

		
		while (num % i != 0 && i<num) {
			i++;
		}
		
		if(i != num) {
			esPrimo = false;
		}
		
		return esPrimo;
	}
	
}
