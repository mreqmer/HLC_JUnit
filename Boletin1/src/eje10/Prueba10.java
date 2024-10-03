package eje10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Prueba10 {

	@ParameterizedTest
	@MethodSource("palindromo")
	void testCompruebaPalindromo(String cadena, boolean esperado) {
		boolean obtenido = Ejercicio10.compruebaPalindromo(cadena);
		assertEquals(esperado, obtenido);
	}

	private static Stream<Arguments> palindromo() {
		return Stream.of(
				 Arguments.of("cadena", false),
				 Arguments.of("anita lava la tina", true), 
		         Arguments.of("Amo la pacifica paloma", true), 
		         Arguments.of("12321", true),
		         Arguments.of("abcba", true),
		         Arguments.of("hola", false)
				);
	}

}
