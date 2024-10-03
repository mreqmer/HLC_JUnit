package eje10;

public class Ejercicio10 {

	public static boolean compruebaPalindromo (String cadena) {
	
	boolean esPalindromo = false;
	String cadenaReves = "";
	
	cadena = cadena.replace(" ", "");
	cadena = cadena.toLowerCase();
	
	for(int i = cadena.length()-1; i>=0; i--) {
		cadenaReves += cadena.charAt(i);
	}
	
	if(cadenaReves.equals(cadena)) {
		esPalindromo = true;
	}

	return esPalindromo;
	}
}
