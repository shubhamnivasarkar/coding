import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {
	@Test
	void testEmptyList() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}

	@Test
	void testAddAtFrontOneElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element = 5;

		slist.AddAtFront(element);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	@Test
	void testAddAtFrontTwoElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) && (listElements[1] == element1));
	}
	@Test
	void testAddAtrear() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;
		int element3=4;
		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2);
		slist.AddAtRear(element3);
		int[] listElements = slist.GetAllElements();
		assertTrue((listElements.length ==3 &&
		             listElements[2]==element3));
	}
	@Test
	void testAddAtrearEmpty() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;
		int element3=4;
		//slist.AddAtFront(element1); // head -> 5
		//slist.AddAtFront(element2);
		slist.AddAtRear(element3);
		int[] listElements = slist.GetAllElements();
		assertTrue((listElements.length ==1 &&
		             listElements[0]==element3));
	}
	@Test
	void testRev() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5
        slist.AddAtFront(11);
		int[] listElements = slist.GetAllElements(); // 11 ,10, 5
        int [] listelamentsRev=slist.GetAllElementsInReverseOrder();//5,10,11
		assertTrue((listElements.length == 3) &&
				(listElements[0] ==listelamentsRev[2] ) && 
				(listElements[1] == listelamentsRev[1]) && 
			    ( listElements[2] ==listelamentsRev[0]));
	}
}
