package binarysearchtree;

import java.util.Arrays;
public class BinarySearchTree {
	
	public Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	//build a tree
	public int[] buildTree() {
		int[] newTree = new int[4];
		newTree[0] =50;
		newTree[1] =20;
		newTree[2] =70;
		newTree[3] =80;
		
		root = new Node(50);
		root.left = new Node(20);
		root.right = new Node(70);
		root.right.right = new Node(80);
		System.out.println(Arrays.toString(newTree));
		return newTree;
		
	}
	
//in order traversal
	public int[] inorderTraversal(Node root, int[] arr,int[] i){
		if(root == null) {
			return arr;
		}
		if(root.left != null) {
			inorderTraversal(root.left,arr,i);
		}
		System.out.println(root.data);
		arr[i[0]++] =root.data;
		if(root.right != null) {
			inorderTraversal(root.right,arr,i);
		}
		return arr;
	}
	
	public int[] checkInorder() {
		int[] arr = new int[this.GetNodesCount()];
		int[] i = new int[1];
		i[0] =0;
		return inorderTraversal(root,arr,i);
	}
	
	private int getCountHelper(Node node) {
		if(node == null)
			return 0;
		return 1 + getCountHelper(node.left) + getCountHelper(node.right);
	}
	
	public int GetNodesCount() {
		return getCountHelper(root);
	}
	
	//count elements in tree
	public int countLeaves(Node node) {
	    if (node==null)
	        return 0;
	    else if (node.left !=null || node.right !=null) {
	        return countLeaves(node.left) + countLeaves(node.right);
	    } 
		else {
	        	return 1;
	    }
	}
}
