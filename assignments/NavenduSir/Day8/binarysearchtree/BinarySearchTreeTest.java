package binarysearchtree;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

	//@Test
	void testInorder() {
		BinarySearchTree bst = new BinarySearchTree();
		int[] a1 = bst.buildTree();
		int[] a2 = bst.checkInorder();
		assertArrayEquals(a1, a2);	
	}
	
	@Test
	void testPreorder() {
		BinarySearchTree bst = new BinarySearchTree();
		int[] a1 = bst.buildTree();
		int[] a2 = bst.checkInorder();
		assertArrayEquals(a1, a2);	
	}

		
	
}
