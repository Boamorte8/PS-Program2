package test;

import static org.junit.Assert.*;

import org.junit.Test;

import math.Nodo;

public class NodoTest {

	@Test
	public void testNodo() {
		Nodo nodoTest = new Nodo();
		assertNotNull(nodoTest);
	}

	@Test
	public void testNodoFloatFloat() {
		float valor1 = (float) 3.4;
		float valor2 = (float) 5.6;
		Nodo nodoTest = new Nodo(valor1, valor2);
		assertNotNull(nodoTest);
	}

	@Test
	public void testGetDato1() {
		float valor1 = (float) 4.5;
		float valor2 = (float) 6.7;
		Nodo nodoTest = new Nodo(valor1, valor2);
		float dato1 = nodoTest.getDato1();
		assertEquals("El dato obtenido es correcto ", 4.5, dato1, 0.1);
	}

	@Test
	public void testSetDato1() {
		float valor1 = (float) 5.6;
		Nodo nodoTest = new Nodo();
		nodoTest.setDato1(valor1);
		float dato1 = nodoTest.getDato1();
		assertEquals("El dato obtenido es correcto ", 5.6, dato1, 0.1);
	}

	@Test
	public void testGetDato2() {
		float valor1 = (float) 4.5;
		float valor2 = (float) 6.7;
		Nodo nodoTest = new Nodo(valor1, valor2);
		float dato2 = nodoTest.getDato2();
		assertEquals("El dato obtenido es correcto ", 6.7, dato2, 0.1);
	}

	@Test
	public void testSetDato2() {
		float valor2 = (float) 9.8;
		Nodo nodoTest = new Nodo();
		nodoTest.setDato2(valor2);
		float dato2 = nodoTest.getDato2();
		assertEquals("El dato obtenido es correcto ", 9.8, dato2, 0.1);
	}

	@Test
	public void testGetSiguiente() {
		Nodo nodoSiguienteTest = new Nodo();
		Nodo nodoTest = new Nodo();
		nodoTest.setSiguiente(nodoSiguienteTest);
		Nodo respuesta = nodoTest.getSiguiente();
		assertNotNull(respuesta);
	}

	@Test
	public void testSetSiguiente() {
		Nodo nodoSiguienteTest = new Nodo();
		Nodo nodoTest = new Nodo();
		nodoTest.setSiguiente(nodoSiguienteTest);
		Nodo respuesta = nodoTest.getSiguiente();
		assertNotNull(respuesta);
	}

}
