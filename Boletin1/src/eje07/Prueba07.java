package eje07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Prueba07 {

	@ParameterizedTest
	@MethodSource("fecha")
	void testFecha(int dia, int mes, int ano, boolean esperado) {
		boolean obtenido = Ejercicio07.compruebaFecha(dia, mes, ano);
		assertEquals(esperado, obtenido);
	}

	private static Stream<Arguments> fecha() {
		return Stream.of(
				Arguments.of(1, 12, 1998, true),
				Arguments.of(0, 12, 1998, false),				
				Arguments.of(32, 12, 1998, false),				
				Arguments.of(1, 0, 1998, false),				
				Arguments.of(1, 13, 1998, false),				
				Arguments.of(1, 1, 2027, false),			
				Arguments.of(29, 2, 1900, true),			
				Arguments.of(29, 2, 2004, true)			
				);
	}

}
