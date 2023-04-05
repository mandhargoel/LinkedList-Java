package LinkedList;

public class LLasQ {
	private LinkedList queue;
	
	public LLasQ() {
		this.queue = new LinkedList();
	}
	public int size() {
		return this.queue.size();
	}
	
	public boolean isEmpty() {
		return this.queue.isempty();
	}
	
	public void enqueue(int data) {
		this.queue.addfirst(data);
	}

	public int dequeue() throws Exception{
		return this.queue.removefirst();
	}
	public int front() throws Exception{
		return this.queue.getfirst();
	}
	
	public void display() {
	 this.queue.display();
	}

}
