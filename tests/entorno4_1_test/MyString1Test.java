package entorno4_1_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entorno4_1.MyString1;

class MyString1Test {

	@Test
	void testContarPalabras() {	
		assertEquals(0, MyString1.contarPalabras(null));
		assertEquals(0, MyString1.contarPalabras(""));
		assertEquals(0, MyString1.contarPalabras(" "));
		assertEquals(1, MyString1.contarPalabras("A"));
		assertNotEquals(1, MyString1.contarPalabras(" ANTON"));
		assertEquals(1, MyString1.contarPalabras("Anton "));
		assertNotEquals(1, MyString1.contarPalabras(" Anton "));
	}
	
	

	@Test
	void testContarLetrasDiferentes() {
		assertNotEquals(0, MyString1.contarLetrasDiferentes("ASdg"));
	}

	@Test
	void testContarFrecuenciaPalabras() {
		assertNotEquals(100, MyString1.contarLetrasDiferentes("ASdg"));
	}

	@Test
	void testContarFrecuenciaLetras() {
		assertNotEquals(0, MyString1.contarLetrasDiferentes("ASdg"));
	}

	@Test
	void testEsPalindroma() {
		assertNotEquals(false, MyString1.contarLetrasDiferentes("ASdg"));
	}

}
