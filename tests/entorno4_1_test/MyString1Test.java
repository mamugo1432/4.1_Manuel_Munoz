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
		assertEquals(0, MyString1.contarLetrasDiferentes(""));
		assertNotEquals(1, MyString1.contarLetrasDiferentes(" "));
		assertEquals(0, MyString1.contarLetrasDiferentes(null));
		assertEquals(4, MyString1.contarLetrasDiferentes(" hola"));
		assertEquals(4, MyString1.contarLetrasDiferentes("hola "));
		assertEquals(0, MyString1.contarLetrasDiferentes(" 123 "));
		assertEquals(0, MyString1.contarLetrasDiferentes("\n"));
	}

	
	

	@Test
	void testContarFrecuenciaPalabras() {
		assertNotEquals(1, MyString1.contarFrecuenciaPalabras(null));
		assertNotEquals(1, MyString1.contarFrecuenciaPalabras(""));
		assertNotEquals(1, MyString1.contarFrecuenciaPalabras(" "));
		assertNotEquals(1, MyString1.contarFrecuenciaPalabras("hola"));
		assertNotEquals(1, MyString1.contarFrecuenciaPalabras(" hola"));
		assertNotEquals(1, MyString1.contarFrecuenciaPalabras(" hola "));
		assertNotEquals(1, MyString1.contarFrecuenciaPalabras("hola "));
		assertNotEquals(1, MyString1.contarFrecuenciaPalabras("1"));
		assertNotEquals(1, MyString1.contarFrecuenciaPalabras("\n"));
	}

	@Test
	void testContarFrecuenciaLetras() {
		assertNotEquals(0, MyString1.contarLetrasDiferentes("ASdg"));
		assertEquals(0, MyString1.contarLetrasDiferentes(""));
		assertEquals(0, MyString1.contarLetrasDiferentes(null));
		assertEquals(0, MyString1.contarLetrasDiferentes(" "));
		assertEquals(0, MyString1.contarLetrasDiferentes("1"));
		assertEquals(0, MyString1.contarLetrasDiferentes("\t"));
		assertEquals(4, MyString1.contarLetrasDiferentes(" ASdg"));
		assertEquals(4, MyString1.contarLetrasDiferentes("ASdg "));
		assertEquals(4, MyString1.contarLetrasDiferentes(" ASdg "));
	}

	@Test
	void testEsPalindroma() {
		assertEquals(false,MyString1.esPalindroma(null));
		assertEquals(false,MyString1.esPalindroma(""));
		assertNotEquals(false,MyString1.esPalindroma(" "));
		assertNotEquals(false,MyString1.esPalindroma("ANa"));
		assertNotEquals(false,MyString1.esPalindroma(" ANa"));
		assertNotEquals(false,MyString1.esPalindroma(" ANa "));
		assertNotEquals(false,MyString1.esPalindroma("ANa "));
		assertEquals(true, MyString1.esPalindroma("ana"));
		assertEquals(true, MyString1.esPalindroma("a luna ese anula"));
		assertEquals(true, MyString1.esPalindroma("1"));
	}

}
