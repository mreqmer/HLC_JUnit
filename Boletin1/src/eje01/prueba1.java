package eje01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class prueba1 {
	
	@ParameterizedTest
	@MethodSource("vocalista")
	void testVocalista(char caracter, boolean esperado) {
		boolean obtenido = ejercicio1.esVocal(caracter);
		assertEquals(esperado, obtenido);
	}
	
	private static Stream<Arguments>vocalista(){
		return Stream.of(
				Arguments.of('a', true),
				Arguments.of('e', true),
				Arguments.of('E', true),
				Arguments.of('i', true),
				Arguments.of('o', true),
				Arguments.of('U', true),
				Arguments.of('t', false));
	}
	
	
//	@Test
//	void testEsVocalAMayuscula() {
//		boolean res = ejercicio1.esVocal('A');
//		assertTrue(res);
//	}
//	
//
//	@Test
//	void testEsVocalEMinuscula() {
//		boolean res = ejercicio1.esVocal('e');
//		assertTrue(res);
//	}
//	@Test
//	void testEsVocalEMayuscula() {
//		boolean res = ejercicio1.esVocal('E');
//		assertTrue(res);
//	}
//	
//	@Test
//	void testEsVocalIMinuscula() {
//		boolean res = ejercicio1.esVocal('i');
//		assertTrue(res);
//	}
//	@Test
//	void testEsVocalIMayuscula() {
//		boolean res = ejercicio1.esVocal('I');
//		assertTrue(res);
//	}
//	
//	@Test
//	void testEsVocalOMinuscula() {
//		boolean res = ejercicio1.esVocal('o');
//		assertTrue(res);
//	}
//	@Test
//	void testEsVocalOEMayuscula() {
//		boolean res = ejercicio1.esVocal('O');
//		assertTrue(res);
//	}
//	
//	@Test
//	void testEsVocalUMinuscula() {
//		boolean res = ejercicio1.esVocal('u');
//		assertTrue(res);
//	}
//	@Test
//	void testEsVocalUMayuscula() {
//		boolean res = ejercicio1.esVocal('U');
//		assertTrue(res);
//	}
//	
//	@Test
//	void testEsVocalConsonante() {
//		boolean res = ejercicio1.esVocal('t');
//		assertFalse(res);
//	}
}