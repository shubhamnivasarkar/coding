package tester;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import insertionsort.InsertionSort;

class TestInsertionSort {

	@Test
	void testInsertionSort() {
		int[] a = {2,4,6,8,1,3,5,7};
		InsertionSort is = new InsertionSort();
		is.insertionSort(a);
		System.out.println(Arrays.toString(a));
		int[] b = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(b));
		assertTrue(a.length==b.length);
		assertArrayEquals(a, b);
	}

}
