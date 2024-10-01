package eje02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Prueba2 {

	@ParameterizedTest
	@MethodSource("esPar")
	void testCompruebaPar(int numero, boolean esperado) {
		boolean obtenido = Ejercicio2.esPar(numero);
		assertEquals(esperado, obtenido);
	}
	
	private static Stream<Arguments>esPar(){
		return Stream.of(
				Arguments.of(2, true),
				Arguments.of(1, false),
				Arguments.of(4, true),
				Arguments.of(5, false),
				Arguments.of(150, true)
				);

	}
}
