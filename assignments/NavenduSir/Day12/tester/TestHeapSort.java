package tester;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import heapsort.HeapSort;

class TestHeapSort {

	@Test
	void testHeapSort() {
		HeapSort hs = new HeapSort();
		int[] a = {12,11,13,5,6,7};
		int[] b = {5,6,7,11,12,13};
		hs.heapSort(a);
		System.out.println(Arrays.toString(a));
		assertArrayEquals(a, b);
	}

}
