package LinkedList;

public class LLasStack {
	private LinkedList stack;
	
	public LLasStack() {
		this.stack = new LinkedList();
	}
	public int size() {
		return this.stack.size();
	}
	
	public boolean isEmpty() {
		return this.stack.isempty();
	}
	
	public void push(int data) {
		this.stack.addfirst(data);
	}
	
	public int pop() throws Exception{
		return this.stack.removefirst();
	}
	public int top() throws Exception{
		return this.stack.getfirst();
	}
	
	public void display() {
	 this.stack.display();
	}
}
