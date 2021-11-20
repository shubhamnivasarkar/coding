package circularqueue;

public class CircularQueue implements ICircularQueue{

	private int size, front, rear;
	private int queue[];
	
	public CircularQueue(int size) {
		this.size=size;
		this.front=0;
		this.rear=0;
		this.queue= new int[size];
	}	
	@Override
	public void insertElement(int elem) {
		
			if((rear+1)%size !=front) {
				rear= (rear)%size;
				queue[rear]= elem;
				System.out.println("element added successfully...");
			}
			else {
				System.out.println("Queue is full...!!");
			}		
	}

	@Override
	public int delete() {
		int item;
		if(front != rear) {
			front = (front+1)%size;
			item = queue[front];
			return item;
		}
		else {
			System.out.println("Queue is empty...!!");
		}
		return 0;
	}

	@Override
	public void display() {
		int j;
		if(front != rear) {
			for(j=(front+1)%size; j<rear; j=(j+1)%size) {
				System.out.println(queue[j]);
			}
		}
		else {
			System.out.println("Queue is empty...!!");
		}			
	}
	@Override
	public boolean isEmpty() {
		if (front!=rear)
			return true;
		return false;
	}
	@Override
	public boolean isFull() {
		if((rear+1)%size !=front)
			return true;
		return false;
	}
}
