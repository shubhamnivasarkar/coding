package implementation;

public class CircularLinkedList implements SortedLinkedListIntf {

     
    
  
    	DoublyListNode head = new DoublyListNode(0);
    
   
	@Override
	public void Insert(int element) {
		DoublyListNode newNode = new DoublyListNode(element);	
	DoublyListNode curr = head.next;
	if(head.next ==null) {
		newNode.next =head;
		newNode.prev = head;
		head.next= newNode;
		head.prev= newNode;
		return;
	}
	while(curr!=head && curr.data < element) {
		 curr= curr.next;
	}
	if(curr==head.next) {
		newNode.next=head.next;
		newNode.prev=head;
		head.next.prev=newNode;
		head.next=newNode;
		return;
	}
		
	curr.prev.next = newNode;
	newNode.next = curr;
	newNode.prev=curr.prev;
	curr.prev= newNode;
		

	}

	@Override
	public void Delete(int element) {
		DoublyListNode node = new DoublyListNode(element);	
		DoublyListNode curr = head.next;
		
		while(curr!=head) {
			if(curr.data == node.data)
				break;
			curr= curr.next;
		}
		if(curr==head.next) {
			head.next = curr.next;
			curr.next.prev =head;
			curr.next=null;
			curr.prev = null;
			return;
		}
		if(curr==head) {
			return;
		}
		curr.prev.next= curr.next;
		curr.next.prev= curr.prev;
		curr.prev=null;
		curr.next=null;
			

	}

	@Override
	public int[] GetAllElements() {
		
		int[] listElement;
		int i =0;
		listElement= new int[getCount()];
		DoublyListNode curr=head.next;
	
		    
		while(curr!=head) {
			
			listElement[i]=curr.data;
			++i;
			curr=curr.next;
		}
		return listElement;
	}

	@Override
	public void AddAtFront(int element) {
		// TODO Auto-generated method stub
		DoublyListNode newNode = new DoublyListNode(element);
//		if(head.next == null) {
//		head.next = newNode;
//		newNode.prev = head;
//		newNode.next= head.prev;
//		head.prev=newNode;
//		return;
//		}
	  if(head.next == null) {
		newNode.next= head;
		newNode.prev = head;
		head.next = newNode;
		head.prev= newNode;
		return;
	  }
	  newNode.next = head.next;
	  newNode.prev = head;
	  head.next.prev = newNode;
	  head.next = newNode;
	  
       
	}
	public int getCount() {
		int count=0;
		 DoublyListNode curr= head.next;
		
		while(curr!=head) {
			++count;
			curr=curr.next;
		}
		return count;
	}

}
