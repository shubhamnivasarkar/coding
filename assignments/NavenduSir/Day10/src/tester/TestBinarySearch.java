package tester;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import binarysearch.BinarySearch;

class TestBinarySearch {

	@Test
	void testBinarySearch() {
		BinarySearch bs = new BinarySearch();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int search = 10;
		int a = bs.search(arr, search);
		System.out.println(search +" found at position:" +a +" using binary search");
		assertNotNull(a);
		assertTrue(a==9);
	}

}
