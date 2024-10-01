package eje07;

public class Ejercicio07 {
	
	public static boolean compruebaFecha(int dia, int mes, int ano) {
		boolean correcta = false;
		
		
		if (ano <= 2024) {
			
			//corregir el switch del año bisiesto
			switch(mes) {
			case 1, 3, 5, 7, 8, 10, 12 ->{
				if(dia >= 1 && dia <= 31) {
					correcta = true;
				}
			}case 4, 6, 9, 11 ->{
				if(dia >= 1 && dia <= 30) {
					correcta = true;
				}
			}case 2->{
				if ((ano % 100 == 0 && ano % 400 == 0)) {
					if (dia >= 1 && dia <= 28) {
						correcta = true;
					}
				}else {
					if (dia >= 1 && dia <= 29) {
						correcta = true;
					}
				}
			}
			}
			
		}
		
		

		return correcta;
		
	}

}
