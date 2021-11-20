package collections;

@SuppressWarnings("unchecked")
public class SinglyLinkedListUsingArrays<T> implements ILinkedList<T> {

	@SuppressWarnings("hiding")
	private class Node<T> {
		T data;
		int next;

		public Node() {
			next = -2;
			data = null;
		}

	}

	Node<T>[] dataArea; // memory for node will be allocated
	int head;
	final int SIZE;

	public SinglyLinkedListUsingArrays(int size) {
		SIZE = size;
		dataArea = new Node[SIZE];
		head = -1;
		for (int i = 0; i < SIZE; i++)
			dataArea[i] = new Node<>();

	}

	@Override
	public void addAtFront(T e) {
		int newNode = getNewElement();
		if (newNode == -1)
			return;
		dataArea[newNode].data = e;
		dataArea[newNode].next = head;
		head = newNode;
	}

	@Override
	public void addAtRear(T e) {
		int newNode = getNewElement();
		if (newNode == -1)
			return;
		dataArea[newNode].data = e;
		dataArea[newNode].next = -1;
		if (head == -1) {
			head = newNode;
			return;
		}
		int cur = head;
		while (dataArea[cur].next != -1)
			cur = dataArea[cur].next;
		dataArea[cur].next = newNode;
	}

	@Override
	public T removeAtRear() {
		int cur = head;
		int prev = 0;
		if (head == -1)
			return null;
		while (dataArea[cur].next != -1) {
			prev = cur;
			cur = dataArea[cur].next;
		}
		dataArea[cur].next = -2;
		if (cur == head)
			head = -1;
		else
			dataArea[prev].next = -1;
		return dataArea[cur].data;
	}

	@Override
	public T removeAtFront() {
		if (head == -1)
			return null;
		int tmp = head;
		head = dataArea[tmp].next;
		dataArea[tmp].next = -2;
		return dataArea[tmp].data;
	}

	@Override
	public void delete(T e) {
		int cur = head;
		int prev = -1;
		while(cur!=-1) {
			if(dataArea[cur].data.equals(e))
			{
				if(cur==head) 
					head=dataArea[cur].next;
				else
					dataArea[prev].next=dataArea[cur].next;
				dataArea[cur].next=-2;
				return;
			}
			
			prev=cur;
			cur=dataArea[cur].next;
		}
	}

	@Override
	public int countFrequency(T e) {
		int cur = head;
		int count = 0;
		while (cur != -1) {
			if (dataArea[cur].data.equals(e))
				count++;

			cur = dataArea[cur].next;
		}

		return count;
	}

	int getNewElement() {
		for (int i = 0; i < SIZE; i++)
			if (dataArea[i].next == -2)
				return i;
		return -1;

	}

	@Override
	public Object[] getAllElements() {
		int size = getNodeCount();
		Object[] elements = new Object[size];
		int cur = head;
		int i = 0;
		while (cur != -1) {
			elements[i] = dataArea[cur].data;
			i++;
			cur = dataArea[cur].next;
		}
		return elements;
	}

	public int getNodeCount() {
		int count = 0;
		int cur = head;
		if (head == -1)
			return 0;
		while (cur != -1) {
			count++;
			cur = dataArea[cur].next;
		}
		return count;
	}

}
