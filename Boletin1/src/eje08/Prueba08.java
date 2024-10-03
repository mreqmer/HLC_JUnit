package eje08;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



class Prueba08 {

	@ParameterizedTest
	@MethodSource("palindromo")
	void testCompruebaPalindromo(int numero, int esperado) {
		int obtenido = Ejercicio08.fibonacci(numero);
		assertEquals(esperado, obtenido);
	}

	private static Stream<Arguments> palindromo() {
		return Stream.of(
				 Arguments.of(10, 34),
				 Arguments.of(1, 0),
				 Arguments.of(2, 1),
				 Arguments.of(9, 21),
				 Arguments.of(13, 144)
				);
	}

}
