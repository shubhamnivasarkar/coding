package tester;

public class Queue2 {
	private String[] array;
	private int front;
	private int rear;
	private int capacity;
	private int count;

	public Queue2(int size) {
		array = new String[5];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	public boolean isFull() {
		if (front == capacity) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (array.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(String item) {
		if (isFull()) {
			System.out.println("* Queue capacity full, cannot insert element!!");
			System.exit(1);
		} else {
			System.out.println("* Inserting " + item);
			rear = (rear + 1);
			array[rear] = item;
			count++;
		}
	}

	public void deQueue() {
		if (isEmpty()) {
			System.out.println("* Queue is already empty, Cannot delete element!!");
		} else {
			System.out.println("Removing " + array[front]);
			front = (front + 1);
			array[front] = null;
			count--;
		}

	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("* Queue is empty!!");
			System.exit(1);
		} else {
			System.out.println("* Front element of the queue is " + array[front]);
		}
	}

	public void show() {
		System.out.println("* Queue elements are:- ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Queue2 q = new Queue2(4);
		q.enQueue("Prateek");
		q.enQueue("Anuja");
		q.enQueue("sep");
		q.enQueue("2020");
//		q.enQueue("*******");
		q.show();
		q.peek();
	}

}
