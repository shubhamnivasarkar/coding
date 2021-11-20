package tester;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import quicksort.QuickSort;

class TestQuickSort {

	@Test
	void test() {
		QuickSort q = new QuickSort();
		int[] a= {1,3,5,7,9,2,4,6,8,0};
		q.quicksort(a, 0, a.length-1);
		int[] b = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		assertTrue(a.length==b.length);
		assertArrayEquals(a, b);
	}

}
