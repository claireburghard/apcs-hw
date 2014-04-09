public class MyStack {
    
    private Node = top;

    //constructor
    public MyStack() {
	top = null;
    }
    
    //push
    public void push(String s) {
        Node tmp = new Node(s);
	tmp.setNext(top);
	top = tmp;
    }

    //pop
    public String pop() {
	String s = top.getData();
	top = top.getNext();
	return s;
    }

    //peek
    public String peek() {
	return top.getData();
    }

    //isEmpty
    public boolean isEmpty() {
	return top == null;
    }
    
    //toString
    public String toString(){
	String s = "";
	Node tmp = top;
	while (tmp != null){
	}
    }

}
