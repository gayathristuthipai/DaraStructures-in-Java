package datastructuresInJava;

class Node{
	public int data;
	public Node next;
	
	public void printData() {
		System.out.println(data+"<<");
	}
}

class SingleLinkedList{
	public Node head;
	
    public boolean isEmpty() {
    	return (head==null);
    }
    
    public void insertFirst(int data) {
    	Node n=new Node();
    	n.data=data;
	    n.next=head;
	    head=n;
    }
    
    public Node deleteFirst() {
    	head=head.next;
    	return head;
    }
    
    public void insertLast(int data) {
    	Node n=new Node();
    	n.data=data;
    	n.next=null;
    	if(head==null)
    		head=n;
    	else
    	{
    		Node current=head;
    	    while(current.next!=null) 
    	    {
    		     current=current.next;
            }
    	current.next=n;
    	}
    }
    
    public void printList() {
    	Node current=head;
    	while(current!=null) {
    		System.out.println(current.data);
    		current=current.next;
    	}
    	
    }
}

public class LinkedListRunner {

	public static void main(
			String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sl=new SingleLinkedList();
		sl.insertFirst(100);
		sl.insertFirst(200);
		sl.insertFirst(300);
		sl.insertLast(500);	
		sl.printList();
		
		
	    if(sl.isEmpty()==true)
	    	System.out.println("List is Empty.");
	    else
	    	System.out.println("List is not empty.");
	}

}
