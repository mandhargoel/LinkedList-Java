package LinkedList;

public class LinkedList {
 
	private class Node{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	
	public int size() {
		return this.size;
	}
	
	public boolean isempty() {
		return this.size()==0;
	}
	
	//o(n)
	public void display() {
		System.out.println("------------------");
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.data + ", ");
			temp=temp.next;
		}
		System.out.println(".");
		System.out.println("------------------");
	}
	
	//o(1)
	public void addlast(int item) {
		//create a new node
		Node nn = new Node();
		nn.data= item;
		nn.next = null;
		
		//attach
		if(this.size >=1) {
			this.tail.next = nn;
		}
		
		//summary object
		if(this.size==0) {
			this.head =nn;
			this.tail=nn;
			this.size++;
		}else {
			this.tail=nn;
			this.size++;
		}
	}
	
	//o(1)
	public void addfirst(int item) {
		//create a new node
		Node nn = new Node();
		nn.data= item;
		nn.next = null;
		
		//attach
		if(this.size >=1) {
			nn.next = head;
		}
		
		//summary object
		if(this.size==0) {
			this.head =nn;
			this.tail=nn;
			this.size++;
		}else {
			this.head=nn;
			this.size++;
		}	
	}

	//o(n)
	public void addat(int item, int index) throws Exception {
		if(index<0||index>this.size) {
			throw new Exception("Invalid Index");
		}
		if(index==0) {
			addfirst( item);
		}else if(index==this.size){
			addlast(item);
		}else {
			//create new node
			Node nn = new Node();
			nn.data= item;
			nn.next = null;
			
			//attach
			Node nm1=getNodeat(index-1);
			Node np1=nm1.next;
			nm1.next=nn;
			nn.next=np1;
			
			//summary update
			this.size++;
		}
	}
	
	//o(1)
	public int getfirst() throws Exception{
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		return this.head.data;
	}
	
	//o(1)
	public int getlast() throws Exception{
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		return this.tail.data;
	}

	//o(n)
	public int getat(int index) throws Exception{
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		if(index<0||index>=this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp = head;
		for(int i=1; i<=index;i++) {
			temp=temp.next;
		}
		return temp.data;
	}
	
	//o(n)
	private Node getNodeat(int index) throws Exception{
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		if(index<0||index>=this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp = head;
		for(int i=1; i<=index;i++) {
			temp=temp.next;
		}
		return temp;
	}

	//o(1)
	public int removefirst() throws Exception {
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		int rv= this.head.data;
		if(this.size==1) {
			this.head=null;
			this.tail=null;
			this.size=0;
		}else {
			this.head=this.head.next;
			this.size--;	
		}
		return rv;
	}
	
	//O(n)
	public int removelast() throws Exception{
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		int rv= this.tail.data;
		if(this.size==1) {
			this.head=null;
			this.tail=null;
			this.size=0;
		}else {
			Node last1=getNodeat(this.size-2);
			this.tail=last1;
			this.tail.next=null;
			this.size--;	
		}
		return rv;
	}
	
	//O(n)
	public int removeat(int index) throws Exception {
		if(this.size==0) {
			throw new Exception("LL is empty");
		}
		if(index<0||index>=this.size) {
			throw new Exception("Invalid Index");
		}
		if(index==0) {
			return removefirst();
		}else if(index==this.size){
			return removelast();
		}else {
			Node nm1 = getNodeat(index-1);
			Node n = nm1.next;
			Node np1 = n.next;
			
			nm1.next=np1;
			this.size--;
			return n.data;	
		}
	}
	
	public void reversedata() throws Exception {
		int left=0;
		int right=this.size-1;
		while(left<right) {
			Node ln = getNodeat(left);
			Node rn = getNodeat(right);
			
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			left++;
			right--;
		}
	}

	public void reversepointers() {
		Node prev = this.head;
		Node curr = prev.next;
		while(curr != null) {
			Node ahead =  curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = ahead;
		}
		//swap
		Node t = this.head;
		this.head = this.tail;
		this.tail = t;
		
		this.tail.next = null;
	}

	public int midnode() {
		Node slow = this.head;
		Node fast = this.head;
		
		while(fast.next != null && fast.next.next != null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	
	public int KthNodeEnd(int k) throws Exception {
		if(k<=0 || k> this.size) {
			throw new Exception("Invali Value of K");
		}
		Node slow = this.head;
		Node fast = this.head;
		for(int i=1;i<=k;i++) {
			fast=fast.next	;
		}
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow.data;
		
	}

}
