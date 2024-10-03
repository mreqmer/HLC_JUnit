package eje09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio09 {

	public static String calculadoraBinario (int numDec) {
		int aux = numDec;
		String numeroCadena = "";
		String numBinario = "";
		
		if(numDec == 0) {
			numeroCadena = "0";
		}
		
		while(aux > 0) {
			numeroCadena += (aux%2);
			aux /= 2;
		}
		
		for(int i = numeroCadena.length()-1; i>=0; i--) {
			numBinario += numeroCadena.charAt(i);
		}
		
		return numBinario;
	}
	
}
