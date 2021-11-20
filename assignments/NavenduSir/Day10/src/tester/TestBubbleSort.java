package tester;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import bubblesort.BubbleSort;

class TestBubbleSort {

	@Test
	void testBubbleSort() {
		BubbleSort bs= new BubbleSort();
		int[] a1 = {5,6,4,8,3,9,1};
		bs.bubbleSort(a1);
		int[] b1 = {1,3,4,5,6,8,9};
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(b1));
		assertArrayEquals(a1, b1);
		
	}

}
