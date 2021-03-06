package collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AVLTreeTest {

	@Test
	void testInsert() {
		AVLTree tree = new AVLTree();

		tree.insert(9);
		tree.insert(15);
		tree.insert(20);
		tree.insert(8);
		tree.insert(7);
		tree.insert(13);
		tree.insert(25);
		tree.insert(22);

		assertEquals(9, tree.root.data);
		assertEquals(8, tree.root.left.data);
		assertEquals(7, tree.root.left.left.data);
		assertEquals(13, tree.root.right.left.data);
		assertEquals(15, tree.root.right.data);
		assertEquals(20, tree.root.right.right.left.data);
		assertEquals(22, tree.root.right.right.data);
		assertEquals(25, tree.root.right.right.right.data);

	}
	
	@Test
	void deleteTest() {
		AVLTree tree = new AVLTree();
		tree.insert(1);
		tree.insert(3);
		tree.insert(2);
		
		int arr[] = {1,2};
		tree.delete(3);
		assertArrayEquals(arr,tree.inOrder());
		
		
		
	}
	
	@Test
	void testDelete2() {
		AVLTree tree = new AVLTree();

		tree.insert(9);
		tree.insert(15);
		tree.insert(20);
		tree.insert(8);
		tree.insert(7);
		tree.insert(13);
		tree.delete(7);

		int arr[] = {8,9,13,15,20};
		assertArrayEquals(arr,tree.inOrder());


	}
	
	@Test
	void testDelete3() {
		AVLTree tree = new AVLTree();

		tree.insert(9);
		tree.insert(15);
		tree.insert(20);
		tree.insert(8);
		tree.insert(7);
		tree.insert(13);
		tree.delete(15);

		int arr[] = {7,8,9,13,20};
		assertArrayEquals(arr,tree.inOrder());


	}
	
	@Test
	void testDelete4() {
		AVLTree tree = new AVLTree();

		tree.insert(9);
		tree.insert(15);
		tree.insert(20);
		tree.insert(8);
		tree.insert(7);
		tree.insert(13);
		tree.delete(20);

		int arr[] = {7,8,9,13,15};
		assertArrayEquals(arr,tree.inOrder());


	}
	@Test
	void testDelete5() {
		AVLTree tree = new AVLTree();

		tree.insert(9);
		tree.insert(15);
		tree.insert(20);
		tree.insert(8);
		tree.insert(7);
		tree.insert(13);
		tree.delete(9);

		int arr[] = {7,8,13,15,20};
		assertArrayEquals(arr,tree.inOrder());


	}

}
