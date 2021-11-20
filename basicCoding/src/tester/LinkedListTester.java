package tester;

public class LinkedListTester {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	// head and tail of the list

	public Node head = null;
	public Node tail = null;

	// adding new node to the list
	public void addNode(int data) {
		Node newNode = new Node(data);
		// check if list is empty,
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			// new node will be added such that tails next pointer will point to newNode;
			tail.next = newNode;
			tail = newNode;
		}
	}

	// display all nodes present in the list
	public void display() {
		// Node current will point to the head
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of the list are: ");
		while (current != null) {
			// prints each node by incrementing pointer
			System.out.print("[" + current.data + "][ next ]->");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListTester ll = new LinkedListTester();
		// add nodes to the list,
		System.out.println("**Linked List**");
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		ll.addNode(5);
		ll.addNode(6);
		ll.addNode(7);
		ll.addNode(8);
		ll.addNode(9);
		ll.addNode(10);
		ll.addNode(11);
		ll.addNode(12);
		ll.display();
	}
}
