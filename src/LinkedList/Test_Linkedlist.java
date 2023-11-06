package LinkedList;

class link{
	Node head;
	
	static class Node{
	int data;
	Node next;
	
	Node(int d){
		data=d;
		next = null;
	}
	}
	
	//----------Insert Element First------------//
	public void insertFirst( int data) {
		Node newNode= new Node(data);
		if(head == null) {
			head = newNode;
			return;
	}
		newNode.next =head;
		head = newNode;
}
	
	
	//----------Insert Element Last------------//
	public void insertLast( int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head=newNode;
			return;
		}
		
		Node current = head;
		while ( current.next != null) {
			current = current.next;
		}
		current.next=newNode;
	}
	
	
	//----------Display------------//
	public void display() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node current = head;
		while(current != null) {
			System.out.print(current.data+"-->");
			current= current.next;
		}
		System.out.println("null");
	}
	}
public class Test_Linkedlist {

	public static void main(String[] args) {
		link obj = new link();
		obj.insertFirst(25);
		obj.display();
		obj.insertFirst(30);
		obj.display();
		obj.insertFirst(45);
		obj.display();
		obj.insertLast(5);
		obj.display();

	}

}
