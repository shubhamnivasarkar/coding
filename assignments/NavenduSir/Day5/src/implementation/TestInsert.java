package implementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInsert {

	@Test
	void testInsertEmpty() {
		DoublyLinkList list = new DoublyLinkList();
		list.Insert(2);
		int[] listE = list.GetAllElements();
	
		assertTrue(listE.length==1);
		
	}
	@Test
	void testInsertBeforeHead() {
		DoublyLinkList list = new DoublyLinkList();
		list.AddAtFront(5);
		list.Insert(2);
		int[] listE = list.GetAllElements();
		
		assertTrue(listE.length==2);
		assertTrue(listE[1]==5);
		assertTrue(listE[0]==2);
		
	}

	@Test
	void testInsertAfterTail() {
		DoublyLinkList list = new DoublyLinkList();
		list.AddAtFront(5);
		list.AddAtFront(4);
		list.Insert(7);
		int[] listE = list.GetAllElements();
		
		assertTrue(listE.length==3);
		assertTrue(listE[1]==5);
		assertTrue(listE[0]==4);
		assertTrue(listE[2]==7);
		
	}
	@Test
	void testInsertAtmiddle() {
		DoublyLinkList list = new DoublyLinkList();
		list.AddAtFront(5);
		list.AddAtFront(2);
		list.Insert(4);
		int[] listE = list.GetAllElements();
		
		assertTrue(listE.length==3);
		assertTrue(listE[1]==4);
		assertTrue(listE[0]==2);
		assertTrue(listE[2]==5);
		
	}
}
