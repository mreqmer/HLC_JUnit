package eje08;

public class Ejercicio08 {

	public static int fibonacci(int numero) {

		int num1 = 0;
		int num2 = 1;
		int aux = 0;
		int res = 0;

		if (numero == 1) {
			res = num1;
		} else if (numero == 2) {
			res = num2;
		} else {
			for (int i = 3; i <= numero; i++) {
				aux = num1 + num2;
				num1 = num2;
				num2 = aux;
			}
			res = num2;
		}

		return res;
	}

}
