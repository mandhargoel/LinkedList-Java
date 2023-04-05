package LinkedList;

public class Client {

	public static void main(String[] args) throws Exception {
		
	LinkedList list = new LinkedList();
	list.addlast(10);
	list.addlast(20);
	list.addlast(30);
	list.addfirst(40);
	list.addfirst(50);
	list.addfirst(60);
	list.addfirst(70);
	list.addfirst(80);
	list.addfirst(90);
	list.addfirst(100);
	list.display();
	System.out.println(list.getfirst());
	System.out.println(list.getlast());
	System.out.println(list.getat(1));
	System.out.println(list.removefirst());
	list.display();
	System.out.println(list.removelast());
	list.display();
	System.out.println(list.removeat(3));
	list.display();
	list.reversedata();
	list.display();
	list.reversepointers();
	list.display();
	System.out.println(list.midnode());
	list.display();
	System.out.println("*********************");
	System.out.println(list.KthNodeEnd(2));
	}

}
