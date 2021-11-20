package circularqueue;

public interface ICircularQueue {

	public void insertElement(int elem);
	public int delete();
	public void display();	
	public boolean isEmpty();
	public boolean isFull();
}
