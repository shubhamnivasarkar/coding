
public class DoublyLinkedList implements LinkedListIntf {
	private DoublyListNode head;
	private DoublyListNode tail;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void AddAtFront(int element) {
		// Make space for new element, say newNode.
		// Store element in newNode's data.
		// Set newNode's next to empty.
		// Set newNode's previous to empty.
		DoublyListNode newNode = new DoublyListNode(element);

		// if list is empty then
		if (head == null) {
			// Set head and tail to newNode.
			head = newNode;
			tail = newNode;
			// Stop.
			return;
		}

		// Set neWNode's next to head
		newNode.next = head;
		// Set head's previous to newNode
		head.prev = newNode;
		// Set head to newNode
		head = newNode;
	}

	@Override
	public void AddAtRear(int element) {
		// TODO Auto-generated method stub
		DoublyListNode newNode = new DoublyListNode(element);
		DoublyListNode curr = head;
		if (tail == null) {
			// Set head and tail to newNode.
			head = newNode;
			tail = newNode;
			// Stop.
			return;
		}

		while(curr!= tail)
			curr = curr.next;
		newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;

	}

	@Override
	public int[] GetAllElements() {
		int[] listElements;
/*
		if (head == null) {
			listElements = new int[0];
			return listElements;
		}
*/
		listElements = new int[GetNodeCount()];
		int i = 0;
		DoublyListNode curr = head;

		while (curr != null) {
			listElements[i] = curr.data;
			++i;
			curr = curr.next;
		}

		return listElements;
	}

	@Override
	public void Delete(int element) {
		// TODO Auto-generated method stub

	}

	public int GetNodeCount() {
		int count = 0;
		DoublyListNode curr = head;

		// Algo: While current is not empty.
		while (curr != null) {
			++count;
			curr = curr.next;
		}

		return count;
	}

	public int[] GetAllElementsInReverseOrder() {
		int[] listElementRev = new int[GetNodeCount()];
		 int i =0;
		 DoublyListNode curr= tail;
		 while(curr!=null) {
			 listElementRev[i]=curr.data;
			 ++i;
			 curr = curr.prev;
		 }
			 
		return listElementRev;
	}
}
