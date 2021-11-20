package tester;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import binarytree.BinaryTree;

class TestBinaryTree {

	//@Test 
	void testTraverseEmptyBST() {
		BinaryTree bt = new BinaryTree();
		int[] exc = new int[0];
		int[] result = bt.inorderForJUnitTest();
		assertArrayEquals(exc, result);
	}
	
	//@Test
	void testPreorder() {
		BinaryTree bt = new BinaryTree();
		int[] a = bt.buildTreeForPreOrder();
		int[] b = bt.preorderForJUnitTest();
		assertArrayEquals(a, b);
	}
	
	//@Test
	void testInorder() {
		BinaryTree bt = new BinaryTree();
		int[] a = bt.buildTreeForInOrder();
		int[] b = bt.inorderForJUnitTest();
		assertArrayEquals(a, b);
	}
	
	//@Test
	void testPostorder() {
		BinaryTree bt = new BinaryTree();
		int[] a = bt.buildTreeForPostOrder();
		int[] b = bt.postorderForJUnitTest();
		assertArrayEquals(a, b);
	}
	
	//@Test
	void testTraverseBSTWithOneElement() {
		BinaryTree bt = new BinaryTree();
		int[] expected = new int[1];
		expected[0] = 10;
		bt.insert(expected[0]);
		int[] result = bt.preorderForJUnitTest();
		assertEquals(expected.length, result.length);
	}
	
	//@Test
	void testDepth() {
		BinaryTree bt = new BinaryTree();
		int[] result = bt.buildTreeForInOrder();
		System.out.println(Arrays.toString(result));
		assertTrue(result.length==4);	
		assertTrue(bt.maxDepthForJUNITest()==3);
	}
	
	//@Test
	void testTraverseBST() {
		BinaryTree bst = new BinaryTree();
		int[] expected = new int[4];
		expected[0] = 1;
		expected[1] = 5;
		expected[2] = 10;
		expected[3] = 15;
		bst.insert(expected[0]);
		bst.insert(expected[1]);
		bst.insert(expected[2]);
		bst.insert(expected[3]);
		System.out.println(Arrays.toString(expected));
		int[] result = bst.inorderForJUnitTest();
		System.out.println(Arrays.toString(result));
		assertArrayEquals(expected, result);
	}
	
	//@Test
	void testCountLeafNodes() {
		BinaryTree bt = new BinaryTree();
	    bt.buildTreeForPreOrder();
	    assertTrue(bt.getNodeCount() == 4);
	}
	
	//@Test
	void testFindFrequency() {
		BinaryTree bt = new BinaryTree();
	    bt.buildTreeForPreOrder();
	    System.out.println(bt.findFrequencyForJUNITTest(1));
	    assertTrue(bt.findFrequencyForJUNITTest(1)==1);
	    assertTrue(bt.findFrequencyForJUNITTest(2)==1);
	    assertTrue(bt.findFrequencyForJUNITTest(3)==1);
	    assertTrue(bt.findFrequencyForJUNITTest(4)==1);
}

}
