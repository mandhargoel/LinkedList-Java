package LinkedList;

public class LLasQClient {

	public static void main(String[] args) throws Exception {
		LLasQ queue = new LLasQ();
		
		queue.enqueue(10);
		queue.display();
		queue.enqueue(20);
		queue.display();
		queue.enqueue(30);
		queue.display();
		queue.enqueue(40);
		queue.display();
		queue.enqueue(50);
		queue.display();
		queue.enqueue(60);
		queue.display();

		System.out.println(queue.dequeue());
		queue.display();
		System.out.println(queue.front());
		queue.display();
		System.out.println(queue.size());
		queue.display();
	

	}

}
