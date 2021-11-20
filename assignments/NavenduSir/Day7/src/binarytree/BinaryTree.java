package binarytree;

import java.util.Arrays;

public class BinaryTree {

	public Node root;
	
	//preorder
	public int[] buildTreeForPreOrder(){
		int[] ele = new int[4];
		ele[0] =1;
		ele[1] =2;
		ele[2] =4;
		ele[3] =3;
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		System.out.println(Arrays.toString(ele));
		return ele;
		}
	
	
	public int[] preorder(Node root, int[] ele, int[] count){
		if(root == null) {
			return ele;
		}
		System.out.println(root.data);
		ele[count[0]++] = root.data;
		if(root.left != null)
			preorder(root.left,ele,count);
		if(root.right != null)
			preorder(root.right,ele,count);
		return ele;
	} 
	
	public int[] preorderForJUnitTest(){
		int[] result = new int[getNodeCount()];
		int[] count = new int[1];
		count[0] = 0;
		return preorder(root,result,count);
	
	}
	
	//postorder
	
	public int[] buildTreeForPostOrder(){
		int[] ele = new int[4];
		ele[0] =5;
		ele[1] =20;
		ele[2] =70;
		ele[3] =50;
		root = new Node(50);
		root.left = new Node(20);
		root.right = new Node(70);
		root.left.left = new Node(5);
		System.out.println(Arrays.toString(ele));
		return ele;
		}
	
	
	public int[] postorder(Node root, int[] ele, int[] count){
		if(root == null) {
			return ele;
		}
		if(root.left != null)
			postorder(root.left,ele,count);
		if(root.right != null)
			postorder(root.right,ele,count);
		System.out.println(root.data);
		ele[count[0]++] = root.data;
		return ele;
	} 
	
	public int[] postorderForJUnitTest(){
		int[] result = new int[getNodeCount()];
		int[] count = new int[1];
		count[0] = 0;
		return postorder(root,result,count);
	
	}
	
	//inorder
	public int[] buildTreeForInOrder(){
		int[] ele = new int[4];
		ele[0] =5;
		ele[1] =20;
		ele[2] =30;
		ele[3] =50;
		root = new Node(50);
		root.left = new Node(20);
		root.left.left = new Node(5);
		root.left.right= new Node(30);
		System.out.println(Arrays.toString(ele));
		return ele;
		}
	
	
	public int[] inorder(Node root, int[] ele, int[] count){
		if(root == null) {
			return ele;
		}
		if(root.left != null)
			inorder(root.left,ele,count);
		System.out.println(root.data);
		ele[count[0]++] = root.data;
		if(root.right != null)
			inorder(root.right,ele,count);

		return ele;
	} 
	
	public int[] inorderForJUnitTest(){
		int[] result = new int[getNodeCount()];
		int[] count = new int[1];
		count[0] = 0;
		return inorder(root,result,count);
	}
	
	//count
	public int countLeaves(Node node) {
		if (node==null)
			return 0;
	        	return 1+ countLeaves(node.left) + countLeaves(node.right);
	    }

	//method for j unit test
	public int getNodeCount() {
		return countLeaves(root);
	}
	
	public void insert(int data){
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
			return;	}
		Node curr = root;
		while(curr != null) {
			if(data<curr.data) {
				curr = curr.left;
				if(curr==null) {
					curr.left = newNode;
					return ;}
			else {
				curr = curr.right;
				if(curr==null) {
					curr.right = newNode;
					return;}	}
	}}}
	
	public int findFrequencyForJUNITTest(int element) {
		int[] count = new int[1];
		count[0] = 0;
		return findFrequency(element, root, count);
	}
	
	private int findFrequency(int element,Node node,int[] count) {
		if(node == null)
			return count[0];
		while(node.left!=null)
			findFrequency(element, node.left, count);
		if(node.data==element)
			count[0]++;
		while(node.right!=null)
			findFrequency(element, node.right, count);
		return count[0];
	}
	
	public int maxDepth(Node node)
    {
        if (node == null)
            return 0;
        else
        {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
            if (lDepth > rDepth)
                return (lDepth + 1);
             else
                return (rDepth + 1);
        }
    }
	
	public int maxDepthForJUNITest() {
		return maxDepth(root);
	}	
	
}
