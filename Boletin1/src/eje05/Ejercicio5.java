package eje05;

public class Ejercicio5 {

	public static boolean esCapicua(int numero) {
		boolean capicua = false;
		int aux = numero;
		int reves = 0;
		int unidad = 0;

		if (numero >= 0 && numero <= 9) {
			capicua = true;
		} else {
			
			while (aux > 0) {
				reves *= 10;
				unidad = aux % 10;
				reves += unidad;
				aux /= 10;
			}

			if (numero == reves) {
				capicua = true;
			}
		}
		return capicua;
	}

}
