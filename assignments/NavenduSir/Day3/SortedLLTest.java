import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedLLTest {

	@Test
	void testInsert() {
		SortedSinglyList slist = new SortedSinglyList();
		slist.Insert(2);
		slist.Insert(4);
		slist.Insert(3);
		slist.Insert(5);
		slist.Insert(20);
		slist.Insert(8);
		slist.Insert(1);
		
		
		int[] list = slist.GetAllElements();
		assertTrue(list[0]==1 && list[6]==20);
	}

}
