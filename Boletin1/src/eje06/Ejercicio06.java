package eje06;

public class Ejercicio06 {
	
	public static double calculadora(int num1, int num2, int opc) {
		double sol = 0;
			
		switch (opc) {
		case 1->{
			sol = num1 + num2;
		} case 2->{
			sol = num1 - num2;
		} case 3 ->{
			sol = num1 * num2;
		} case 4 ->{
			sol = num1 / num2;
		} default ->{
			sol = -999999999;
		}
		}
		
		return sol;
	}

}
