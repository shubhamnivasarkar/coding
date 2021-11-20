package tester;

public class Stack2 {
	private String array[];
	private int top;
	private int capacity;

	public Stack2(int size) {
		array = new String[size];
		capacity = size;
		top = -1;
	}

	public boolean isFull() {
		if (top == capacity - 1) {
			return true;
		} else
			return false;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void push(String x) {
		if (isFull()) {
			System.out.println("* Stack is full, element cannot be inserted!!");
		} else {
			System.out.println("* Inserting " + x + " at the top of the stack!");
			array[++top] = x;
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("* Stack is empty, element cannot be removed!!");
		} else {
			System.out.println("* Removing" + array[top] + "from top of the stack!");
			array[top--] = null;
		}
	}

	public void display() {
		System.out.println("* Stack elements are ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println(" ");
	}

	public String peek() {
		return array[top];
	}

	public static void main(String[] args) {
		Stack2 s = new Stack2(4);
		s.push("prateek");
		s.push("anu");
		s.push("25 september");
		s.push("2020");
		s.display();
		System.out.println(s.peek());

	}

}
