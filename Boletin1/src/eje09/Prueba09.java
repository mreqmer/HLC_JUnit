package eje09;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



class Prueba09 {

	@ParameterizedTest
	@MethodSource("binario")
	void testCalcBinario(int numDecimal, String esperado) {
		String obtenido = Ejercicio09.calculadoraBinario(numDecimal);
		assertEquals(esperado, obtenido);
	}

	private static Stream<Arguments> binario() {
		return Stream.of(
				 Arguments.of(428, "110101100"),    
	             Arguments.of(2, "10"),
	             Arguments.of(0, "0"), 
	             Arguments.of(1, "1"), 
	             Arguments.of(255, "11111111")
				);
	}

}
