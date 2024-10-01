package eje04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Prueba4 {

	@ParameterizedTest
	@MethodSource("esPrimo")
	void testPrimo (int numero, boolean esperado) {
		boolean obtenido = Ejercicio4.esPrimo(numero);
		assertEquals(esperado, obtenido);
	}
	
	private static Stream<Arguments>esPrimo(){
		return Stream.of(
				Arguments.of(2, true),
				Arguments.of(3, true),
				Arguments.of(4, false),
				Arguments.of(9, false)
				);
	}


}
