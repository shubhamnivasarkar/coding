
public class SortedSinglyList implements SortedLinkedListIntf {
  private SinglyListNode head;
  
  public  SortedSinglyList() {
	// TODO Auto-generated constructor stub
	  head = null;
}
	@Override
	public void Insert(int element) {
		// TODO Auto-generated method stub
		SinglyListNode newNode= new SinglyListNode(element);
		if(head==null) {
			newNode.next= head;
			head = newNode;
		}
		else if(head!= null && head.data > element) {
			newNode.next = head;
			 head= newNode;
		}
		else {
			SinglyListNode curr= head;
			SinglyListNode prev =null ;
				
			while( curr!= null && curr.data < element ) {
			      prev = curr;
			      curr=curr.next;
			}
		 newNode.next= curr;  
		prev.next = newNode;
		 
		}

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
				SinglyListNode curr = head;

				while (curr != null) {
					listElements[i] = curr.data;
					++i;
					curr = curr.next;
				}

				return listElements;
	}public int GetNodeCount() {
		int count = 0;
		SinglyListNode curr = head;

		// Algo: While current is not empty.
		while (curr != null) {
			++count;
			curr = curr.next;
		}

		return count;
	}

}
