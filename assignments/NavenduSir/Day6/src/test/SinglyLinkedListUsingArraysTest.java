package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import collections.SinglyLinkedListUsingArrays;

class SinglyLinkedListUsingArraysTest {

	@Test
	void initialSize() {
		SinglyLinkedListUsingArrays<Integer> list = new SinglyLinkedListUsingArrays<>(5);
		Object[] arr = list.getAllElements();
		assertTrue(arr.length == 0);
	}

	@Test
	void testAddElementAtFront() {
		SinglyLinkedListUsingArrays<Integer> list = new SinglyLinkedListUsingArrays<>(5);
		Integer element = 2;
		list.addAtFront(element);
		Object[] arr = list.getAllElements();
		assertTrue(arr.length == 1);
		assertEquals(element, arr[0]);
	}

	@Test
	void testElementInBetween() {
		SinglyLinkedListUsingArrays<Integer> list = new SinglyLinkedListUsingArrays<>(5);
		list.addAtFront(1);
		list.addAtFront(2);
		list.addAtFront(3);
		Object[] arr = list.getAllElements();
		assertTrue(arr[0].equals(3) && arr[1].equals(2) && arr[2].equals(1));
	}

	@Test
	void testElementAtRear() {
		SinglyLinkedListUsingArrays<Integer> list = new SinglyLinkedListUsingArrays<>(5);
		list.addAtRear(3);
		list.addAtRear(2);
		list.addAtRear(1);
		Object[] arr = list.getAllElements();
		assertTrue(arr[0].equals(3) && arr[1].equals(2) && arr[2].equals(1));
	}

	@Test
	void testDeleteFrontList() {
		SinglyLinkedListUsingArrays<Integer> list = new SinglyLinkedListUsingArrays<>(5);
		list.addAtFront(5);
		list.addAtFront(12);
		list.addAtFront(13);
		Integer a = list.removeAtFront();
		Object[] arr = list.getAllElements();
		assertEquals(a, 13);
		assertTrue(list.getNodeCount() == 2);
		assertTrue(arr[0].equals(12));
		assertTrue(arr[1].equals(5));
	}

	@Test
	void testDeleteRearList() {
		SinglyLinkedListUsingArrays<Integer> list = new SinglyLinkedListUsingArrays<>(5);
		list.addAtFront(5);
		list.addAtFront(12);
		list.addAtFront(13);
		Integer a = list.removeAtRear();
		Object[] arr = list.getAllElements();
		assertEquals(a, 5);
		assertTrue(list.getNodeCount() == 2);
		assertTrue(arr[0].equals(13));
		assertTrue(arr[1].equals(12));
	}

	@Test
	void testFrequency() {
		SinglyLinkedListUsingArrays<Integer> list = new SinglyLinkedListUsingArrays<>(5);
		list.addAtFront(5);
		list.addAtRear(10);
		list.addAtFront(10);
		list.addAtFront(5);
		list.addAtFront(10);

		Object[] arr = list.getAllElements();
		assertEquals(5, arr.length);
		assertEquals(2, list.countFrequency(5));
		assertEquals(3, list.countFrequency(10));

	}

	@Test
	void testDelete() {
		SinglyLinkedListUsingArrays<Integer> list = new SinglyLinkedListUsingArrays<>(5);

		list.addAtFront(5);
		list.addAtRear(10);
		list.addAtFront(10);
		list.addAtFront(5);
		list.addAtFront(10);

		for (int i = 0, j = list.countFrequency(10); i < j; i++)
			list.delete(10);

		assertEquals(2, list.countFrequency(5));
		assertEquals(0, list.countFrequency(10));
	}

}
