package entorno4_1_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import entorno4_1.MyString1;

class MyString1Test {

	@Test
	void testContarPalabras() {	
		assertEquals(0, MyString1.contarPalabras(null));
		assertEquals(0, MyString1.contarPalabras(""));
		assertEquals(0, MyString1.contarPalabras(" "));
		assertEquals(1, MyString1.contarPalabras("A"));
		assertEquals(1, MyString1.contarPalabras("Anton "));
		
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
		Map<String, Integer> esperada1 = new HashMap<>(Map.of("mundo", 2));
		 
		
		/*assertTrue(esperada1.equals(MyString1.contarFrecuenciaPalabras("hola hola")));
		esperada1.clear();
		esperada1.put("mundo", 2);*/
		
		assertTrue(esperada1.equals(MyString1.contarFrecuenciaPalabras(" mundo mundo")));
		assertFalse(esperada1.equals(MyString1.contarFrecuenciaPalabras(null)));
		assertFalse(esperada1.equals(MyString1.contarFrecuenciaPalabras("")));
		assertFalse(esperada1.equals(MyString1.contarFrecuenciaPalabras("Hola que tal, amo mi mundo")));
		assertTrue(esperada1.equals(MyString1.contarFrecuenciaPalabras("                mundo                mundo ")));
		

		
		

	}

	@Test
	void testContarFrecuenciaLetras() {
		Map<Character, Integer> esperada1 = new HashMap<>(Map.of('m', 2, 'u', 2, 'n', 2, 'd', 2, 'o', 2));
		assertTrue(esperada1.equals(MyString1.contarFrecuenciaLetras(" mundo mundo")));
		assertTrue(esperada1.equals(MyString1.contarFrecuenciaLetras(" mundo mundo ")));
		assertFalse(esperada1.equals(MyString1.contarFrecuenciaLetras("")));
		assertFalse(esperada1.equals(MyString1.contarFrecuenciaLetras(null)));
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
		assertNotEquals(true, MyString1.esPalindroma("aw"));
	}

}
