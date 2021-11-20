package tester;

public class MyCircularQueue {
	int size = 5;
	int front;
	int rear;
	int array[] = new int[size];

	public MyCircularQueue() {
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
		if (front == 0 && rear == size - 1) {
			return true;
		} else
			return false;
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		} else
			return false;
	}

	// adding element
	public void enQ(int element) {
		if (isFull()) {
			System.out.println("Queue is full!!");
		} else {
			if (front == -1)
				front = 0;
			rear = (rear + 1) % size;
			array[rear] = element;
			System.out.println("inserted " + element);
		}

	}

	public int deQ() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is Empty, ");
			return -1;
		} else {
			element = array[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front = (front + 1) % size;
			}
			return element;
		}

	}

	public void display() {
		int i;
		if (isEmpty()) {
			System.out.println("empty queue!");
		} else

			for (i = 0; i < array.length; i++) {
				System.out.println(array[i]);

			}
	}

	// main function
	public static void main(String[] args) {
		MyCircularQueue q = new MyCircularQueue();
		q.deQ();
		q.enQ(100);
		q.enQ(200);
		q.enQ(300);
		q.enQ(500);
		q.enQ(600);
		q.display();
	}
	

}
