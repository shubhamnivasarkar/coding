import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree implements BinaryTreeIntf {
	BinaryTreeNode root;

	public BinaryTree() {
		root = null;
	}

	private void PreOrderHelper(BinaryTreeNode root, int[] elements, int[] count) {
		// if root is empty then Stop
		if (root == null) {
			return;
		}

		// Process root node's data.
		System.out.println(root.data);
		elements[count[0]++] = root.data; 

		// if root node's left child exists then
		if (root.lChild != null) {
			// PreOrder(root's left child)
			PreOrderHelper(root.lChild, elements, count);
		}

		// if root node's right child exists then
		if (root.rChild != null) {
			// PreOrder(root's right child)
			PreOrderHelper(root.rChild, elements, count);
		}

		return;
	}

	@Override
	public int[] PreOrder() {
		int[] result = new int[GetNodesCount()];
		int[] count = new int[1];

		count[0] = 0;
		PreOrderHelper(root, result, count);
		return result;
	}

	public int[] BuildTreeForPreOrder() {
		int[] element = new int[4];
		element[0] = 1;
		element[1] = 2;
		element[2] = 4;
		element[3] = 3;

		root = new BinaryTreeNode(1);
		root.lChild = new BinaryTreeNode(2);
		root.rChild = new BinaryTreeNode(3);
		root.lChild.lChild = new BinaryTreeNode(4);

		return element;
	}

	public int[] BuildTreeForLevelOrder() {
		int[] element = new int[6];
		element[0] = 1;
		element[1] = 2;
		element[2] = 3;
		element[3] = 4;
		element[4] = 5;
		element[5] = 6;

		root = new BinaryTreeNode(1);
		root.lChild = new BinaryTreeNode(2);
		root.rChild = new BinaryTreeNode(3);
		// Child of node 2.
		root.lChild.lChild = new BinaryTreeNode(4);
		root.lChild.rChild = new BinaryTreeNode(5);
		//Child of node 3
		root.rChild.rChild = new BinaryTreeNode(6);

		return element;
	}

	@Override
	public int[] PostOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] InOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	private int GetNodesCountHelper(BinaryTreeNode root) {
		// It tree is empty then return 0.
		if (root == null) {
			return 0;
		}

		return 1 + GetNodesCountHelper(root.lChild) +
				GetNodesCountHelper(root.rChild);
	}

	@Override
	public int GetNodesCount() {
		return GetNodesCountHelper(root);
	}

	@Override
	public int Height() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int FindFrequency(int element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int CountLeafNodes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int MakeMirror() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] LevelOrder() {
		int[] result = new int[GetNodesCount()];
		int count = 0;

		// If root is empty then Stop
		if (root == null) {
			return result;
		}

		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();

		// Add root node to the queue.
		q.add(root);

		// while queue is not empty do
		while (q.size() != 0) {
			// Get a node from queue.
			BinaryTreeNode node = q.remove();

			// Process the node.
			System.out.println(node.data);
			result[count++] = node.data;

			// Add non empty child of node to queue.
			if (node.lChild != null) {
				q.add(node.lChild);
			}
			if (node.rChild != null) {
				q.add(node.rChild);
			}
		}

		return result;
	}
}
