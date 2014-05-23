public class MyQueue {

    private Node head; //get the Node class from the classcode!!
    private Node tail;

    public MyQueue(){
	head = null;
	tail = null;
	//we don't really need a constructor, but we make it anyway
	//because it is a good habit.
	//it's a form of consistency, especially when working on teams,
	//working with several variables,
	//or working across languages.
    }
    
    public void enqueue(String s){
	Node n = new Node(s);
	if (head == null){
	    head = n;
	    tail = n;
	}
	else{
	    tail.setNext(n);
	    tail = n;
	}

    }

    public String dequeue(){
	String s = null;
	if (head != null){
	    s = head.getData();
	    head = head.getNext();
	}
	if (head == null){
	    tail = null;
	}
	return s;
    }

    public boolean isEmpty(){
	return head == null;
    }

    //get other stuff from classcode 

    //get the toString from classcode 
	
}
