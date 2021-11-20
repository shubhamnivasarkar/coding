package tester;

public class MyStack {
	int array[];
	int top;
	int capacity;

	public MyStack(int size) {
		array = new int[5];
		capacity = size;
		top = -1;

	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else
			return false;

	}

	public boolean isFull() {
		if (top == capacity - 1) {
			return true;
		} else
			return false;
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack is full, cannot insert element!");
		} else
			System.out.println("pushing " + data);
		array[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty, cannot delete element!");
			return -1;
		} else
			System.out.println("Removing element: " + peek());
		array[top] = 0;
		return array[top--];

	}

	public int peek() {
		return array[top];
	}

	public void display() {
		System.out.println("Stack elements:- ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// main function
	public static void main(String[] args) {
		MyStack s = new MyStack(5);
		System.out.println("Is stack full?");
		System.out.println(s.isFull());
		System.out.println("is Stack empty?");
		System.out.println(s.isEmpty());

		System.out.println("performing push operation!");
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		System.out.println("top element in the stack! ");
		s.peek();
		s.display();

	}

}
