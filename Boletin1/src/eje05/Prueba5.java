package eje05;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import eje04.Ejercicio4;

class Prueba5 {

	@ParameterizedTest
	@MethodSource("esCapicua")
	void testCapicua(int numero, boolean esperado) {
		boolean obtenido = Ejercicio5.esCapicua(numero);
		assertEquals(esperado, obtenido);
	}

	private static Stream<Arguments> esCapicua() {
		return Stream.of(
				Arguments.of(121, true),
				Arguments.of(1221, true),
				Arguments.of(-1, false),
				Arguments.of(11, true),
				Arguments.of(12, false),
				Arguments.of(121, true),
				Arguments.of(122, false),
				Arguments.of(12421, true)
				);
	}
	
	

}
