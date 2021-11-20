package implementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculatingTestCase {

	@Test
	void testAddAtFront() {
         CircularLinkedList list= new CircularLinkedList();
         
        list.AddAtFront(1);
        list.AddAtFront(2);
        list.AddAtFront(10);
         int[] listEle = list.GetAllElements();
         assertTrue(listEle.length ==3);
         assertTrue(listEle[0]==10);
         assertTrue(listEle[1]==2);
         assertTrue(listEle[2]==1);
	}

	@Test
	void testInsert() {
		 CircularLinkedList list= new CircularLinkedList();
		 list.AddAtFront(2);
         list.Insert(3);
         
         int[] listEle = list.GetAllElements();
         assertTrue(listEle.length ==2);
         assertTrue(listEle[0]==2);
         assertTrue(listEle[1]==3);
	}
	@Test
	void testInsertSmall() {
		 CircularLinkedList list= new CircularLinkedList();
		 list.AddAtFront(3);
		 list.AddAtFront(2);
        list.Insert(1);
        
        int[] listEle = list.GetAllElements();
        assertTrue(listEle.length ==3);
        assertTrue(listEle[0]==1);
        assertTrue(listEle[1]==2);
        assertTrue(listEle[2]==3);
	}
	@Test
	void testDeleteFirstNode() {
		CircularLinkedList list= new CircularLinkedList();
       list.AddAtFront(2);
       list.AddAtFront(1);
       list.Delete(1);
       int[] listEle = list.GetAllElements();
       assertTrue(listEle.length==1);
       assertTrue(listEle[0]==2);
	}
	@Test
	void testDelete() {
		  CircularLinkedList list= new CircularLinkedList();
	       list.AddAtFront(1);
	       list.AddAtFront(2);
	       list.Insert(4);
	       list.Delete(2);
	       list.Delete(9);
	       int[] listEle = list.GetAllElements();
	       assertTrue(listEle.length==2);
	       assertTrue(listEle[0]==1);
	       assertTrue(listEle[1]==4);
	}
}
