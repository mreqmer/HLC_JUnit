package eje06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import eje05.Ejercicio5;

class Prueba06 {

	@ParameterizedTest
	@MethodSource("calc")
	void testCalculadora(int numero1, int numero2, int opc, double esperado) {
		double obtenido = Ejercicio06.calculadora(numero1, numero2, opc);
		assertEquals(esperado, obtenido);
	}

	private static Stream<Arguments> calc() {
		return Stream.of(
				Arguments.of(1, 2, 1, 3),
				Arguments.of(-1, 2, 2, -3),
				Arguments.of(2, 4, 3, 8),
				Arguments.of(4, 2, 4, 2),
				Arguments.of(9, 4, 9, -999999999)
				
				);
	}

}
