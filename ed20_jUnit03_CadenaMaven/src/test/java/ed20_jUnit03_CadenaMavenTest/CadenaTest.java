package ed20_jUnit03_CadenaMavenTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ed20_jUnit03_CadenaMaven.Cadena;

class CadenaTest {

	private Cadena frase;
	
	@BeforeEach
	void setUp() throws Exception {
		frase = new Cadena();
	}

	@Test
	void testLongitud() {
		int expected=4;
		int actual=frase.longitud("hola");
		assertEquals(expected,actual,"Testing longitud");
		
		int expected2=0;
		int actual2=frase.longitud("");
		assertEquals(expected2,actual2,"Testing longitud");
	}

	@Test
	void testVocales() {
		int expected=2;
		int actual=frase.vocales("hola");
		assertEquals(expected,actual,"Testing vocals");
		
		int expected2=0;
		int actual2=frase.vocales("");
		assertEquals(expected2,actual2,"Testing vocals");
	}

	@Test
	void testInvertir() {
		String expected="aloh";
		String actual=frase.invertir("hola");
		assertEquals(expected,actual,"Testing invertir");
		
		String expected2="";
		String actual2=frase.invertir("");
		assertEquals(expected,actual,"Testing invertir");
	}

	@Test
	void testContarLetra() {
		int expected=1;
		int actual=frase.contarLetra("hola", 'a');
		assertEquals(expected,actual,"Testing caracteres");
		
		int expected2=0;
		int actual2=frase.contarLetra("",'a');
		assertEquals(expected2,actual2,"Testing caracteres");
	}

}
