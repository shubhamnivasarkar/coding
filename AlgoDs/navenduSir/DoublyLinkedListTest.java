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
	void testDeleteFromEmptyList() {
		DoublyLinkedList slist = new DoublyLinkedList();
		slist.Delete(1);
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}

	@Test
	void testDeleteElementNotInList() {
		DoublyLinkedList slist = new DoublyLinkedList();
		slist.AddAtFront(10); // head -> 10
		slist.Delete(1); // head -> 10
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 1);
		assertTrue(listElements[0] == 10);
	}

	@Test
	void testDeleteOnlyElementInList() {
		DoublyLinkedList slist = new DoublyLinkedList();
		slist.AddAtFront(10); // head -> 10
		slist.Delete(10); // head -> empty
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}

	@Test
	void testDeleteLastElementInList() {
		DoublyLinkedList slist = new DoublyLinkedList();
		slist.AddAtFront(10); // head -> 10
		slist.AddAtFront(5); // head -> 5 -> 10
		slist.Delete(10); // head -> 5
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 1);
		assertTrue(listElements[0] == 5);
	}

	@Test
	void testDeleteIntermediateElementInList() {
		DoublyLinkedList slist = new DoublyLinkedList();
		slist.AddAtFront(10); // head -> 10
		slist.AddAtFront(5); // head -> 5 -> 10
		slist.AddAtFront(1); // head -> 1 -> 5 -> 10
		slist.Delete(5); // head -> 1 -> 10
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 2);
		assertTrue(listElements[0] == 1);
		assertTrue(listElements[1] == 10);
	}
}
