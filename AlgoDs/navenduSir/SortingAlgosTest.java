import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingAlgosTest {
	@Test
	void test() {
		int[] sortedElements = {1, 2, 4, 10, 15, 20};
		int[] elements = {4, 20, 15, 10, 1, 2};
		SortingAlgos s = new SortingAlgos();
		s.MergeSort(elements);
		assertArrayEquals(elements, sortedElements);
	}
}
