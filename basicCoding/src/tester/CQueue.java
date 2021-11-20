package tester;

//circular queue implementation in java
public class CQueue {
	int SIZE = 5;
	int front, rear;
	int items[] = new int[SIZE];

	public CQueue() {
		front = -1;
		rear = -1;

	}

	public boolean isFull() {
		if (front == 0 && rear == SIZE - 1) {
			return true;

		}
		if (front == rear + 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;

		} else
			return false;
	}

	// adding element
	public void enQueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full: ");

		} else {
			if (front == -1)
				front = 0;
			rear = (rear + 1) % SIZE;
			items[rear] = element;
			System.out.println("Inserted " + element);
		}
	}

	public int deQueue() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is  empty: ");
			return (-1);
		} else {
			element = items[front];
			if (front == rear) {
				front = -1;
				rear = -1;

			} else {
				front = (front + 1) % SIZE;
			}
			return element;
		}
	}

	public void display() {
		int i;
		if (isEmpty()) {
			System.out.println("Empty queue ");
		} else {
			System.out.println("Front -> " + front);
			System.out.println("Items -> ");
			for (i = front; i != rear; i = (i + 1) % SIZE) // traversal for iterating through the circular queue

				System.out.print(items[i] + " ");
			System.out.println(items[i]);
			System.out.println("Rear -> " + rear);

		}
	}

	public static void main(String[] args) {
		CQueue q = new CQueue();
		q.deQueue();
		// fails because front=-1;
		q.enQueue(100);
		q.enQueue(200);
		q.enQueue(300);
		q.enQueue(400);
		q.enQueue(500);
		// fails because front == 0 and rear = size-1;
		q.enQueue(600);
		q.display();
//		int elem = q.deQueue();
//		if (elem != -1) {
//			System.out.println("deleted element is: " + elem);
//		}
		q.display();
		q.enQueue(700);
		q.deQueue();
		q.display();
		System.out.println(q.deQueue());
		q.display();
	}
}