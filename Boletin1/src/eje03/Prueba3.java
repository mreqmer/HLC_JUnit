package eje03;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Prueba3 {

	@ParameterizedTest
	@MethodSource("cadena")
	void TestFizzBuzz (int numero, String esperado) {
		String obtenido = Ejercicio3.fizzBuzz(numero);
		assertEquals(esperado, obtenido);
	}
	
	private static Stream<Arguments>cadena(){
		return Stream.of(
				Arguments.of(3, "fizz"),
				Arguments.of(5, "buzz"),
				Arguments.of(2, ""),
				Arguments.of(15, "fizzbuzz")
				);
	}

}
