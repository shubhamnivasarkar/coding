package tester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import linearsearch.LinearSearch;

class TestLinearSearch {

	@Test
	void testLinearSearch() {
		LinearSearch ls = new LinearSearch();
		int arr[] = {1,2,3,4,5};
		int search = 4;
		int a = ls.linearSearchHelper(arr, search);
		System.out.println(search +" found at position:" +a);
		assertNotNull(a);	
	}

}
