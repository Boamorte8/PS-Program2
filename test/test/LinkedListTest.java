package test;

import static org.junit.Assert.*;

import org.junit.Test;

import math.LinkedList;
import math.Nodo;

public class LinkedListTest {
	
	@Test
	public void testLinkedList() {
		LinkedList list = new LinkedList();
		assertNotNull(list);
	}
	
	@Test
	public void testIncrementListSize(){
		LinkedList list = new LinkedList();
		list.incrementListsize();
		assertEquals(1, list.getListsize());
	}
	
	@Test
	public void testDecrementListSize(){
		LinkedList list = new LinkedList();
		list.decrementListsize();
		assertEquals(-1, list.getListsize());
	}
	
	@Test
	public void testSetCabeza() {
		LinkedList list = new LinkedList();
		Nodo nodo=new Nodo(1,1);
		list.setCabeza(nodo);
		assertEquals(nodo, list.getCabeza());
	}	
	
	@Test
	public void testAddNodo() {
		LinkedList list = new LinkedList();
		Nodo nodo=new Nodo();
		list.addNodo(nodo);
		assertEquals(1, list.getListsize());
	}	
	
}
