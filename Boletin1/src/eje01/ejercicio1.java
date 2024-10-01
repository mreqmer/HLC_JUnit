package eje01;

public class ejercicio1 {
	
	public static boolean esVocal(char letra) {
		
		boolean vocal = false;
		
		switch(Character.toLowerCase(letra)) {
			case 'a', 'e', 'i', 'o', 'u' -> vocal = true;
		}
		
		return vocal;
	}

}
