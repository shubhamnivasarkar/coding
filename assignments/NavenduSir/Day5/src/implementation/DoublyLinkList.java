package implementation;



public class DoublyLinkList implements SortedLinkedListIntf {
       DoublyListNode head;
       DoublyListNode tail;
       
        public DoublyLinkList() {
		// TODO Auto-generated constructor stub
    	  head=null;
    	  tail=null;
	}

	@Override
	public void Insert(int element) {
		DoublyListNode newNode = new DoublyListNode(element);
		DoublyListNode curr = head;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		while(curr!=null && curr.data < element) {
			curr = curr.next;
		}
		if(curr==head) {
		 newNode.next = curr;
		curr.prev = newNode;
		head= newNode;
		return;
		}
		if(curr==null) {
			tail.next=newNode;
			newNode.prev= tail;
			tail= newNode;
			return;
		}
		 curr.prev.next=newNode;
		 newNode.prev = curr.prev;
		 newNode.next=curr;
		 curr.prev=newNode;
		 
		
	}

	@Override
	public void Delete(int element) {
		// TODO Auto-generated method stub
		
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


}
