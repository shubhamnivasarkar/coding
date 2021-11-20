package tester;

public class MyTree {
	Node root;

	class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
			right = null;
			left = null;
		}
	}

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}
		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}
		return current;
	}

//method that starts the recursion from the root node!
	public void add(int value) {
		root = addRecursive(root, value);
	}

	private MyTree createBinaryTree() {
		MyTree bt = new MyTree();
		bt.add(100);
		bt.add(60);
		bt.add(70);
		bt.add(60);
		return bt;
	}

	public static void main(String[] args) {

	}

}
