package tester;

public class Stack {
	private int arr[];
	private int top;
	private int capacity;

	public Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack is full, cannot insert elements!!");
		}
		System.out.println("Inserting:- " + x);
		arr[++top] = x;

	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty, cannot pull element!!");
			System.exit(1);
		}
		System.out.println("Removing:- " + peek());
		arr[top] = 0;
		return arr[top--];

	}

	// function to return top element of the stack
	public int peek() {
		if (!isEmpty()) {
			return arr[top];
		} else {
			System.exit(1);
		}
		return -1;
	}

//function to return the size of the stack
	public int size() {
		return top + 1;
	}

//function to check if stack is empty
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

//function to check if queue is fulll 
	public boolean isFull() {
		if (top == capacity - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void display() {
		System.out.println("* Stack  contains:- ");
		for (int i = 0; i < capacity; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push(100);
		s.push(200);
		s.push(300);
		s.display();
		System.out.println(" * Top element is " + s.peek());
		s.pop();
		s.display();
		s.pop();
		s.display();
		s.pop();
		s.display();
//		s.pop();
		s.push(2000);
		s.display();
		s.push(3000);
		s.display();
		s.push(4000);
		s.display();
		s.push(5000);
		s.display();
		s.push(6000);
		s.display();

	}
}