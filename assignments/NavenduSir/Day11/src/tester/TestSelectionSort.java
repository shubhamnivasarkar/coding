package tester;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import selectionsort.SelectionSort;

class TestSelectionSort {

	@Test
	void testSelectionSort() {
		
		SelectionSort ss  = new SelectionSort();
		int[] a = {4,5,6,7,3,2,1,8,9};
		int[] unsorted = {1,2,3,4,5,6,7,8,9};
		ss.selectionSort(a);
		assertTrue(a.length==9);
		System.out.println(Arrays.toString(a));
		assertTrue(unsorted.length==9);
		System.out.println(Arrays.toString(unsorted));
		assertArrayEquals(a, unsorted);
	}

}
