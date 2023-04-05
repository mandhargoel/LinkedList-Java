package LinkedList;

public class LLasStackClient {

	public static void main(String[] args) throws Exception {
		LLasStack stack = new LLasStack();
		
		stack.push(10);
		stack.display();
		stack.push(20);
		stack.display();
		stack.push(30);
		stack.display();
		stack.push(40);
		stack.display();
		stack.push(50);
		stack.display();

		System.out.println(stack.pop());
		stack.display();
		System.out.println(stack.top());
		stack.display();
		System.out.println(stack.size());
		stack.display();
	}

}
