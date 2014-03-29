public class DoubleLL<E> {
    
    private class Node<E> {
	E data;
	Node<E> next,prev;

	public Node(E d){
	    this.data = d;
	}
	public String toString(){
	    return "" + data;
	}
	public void setData(E d){
	    data = d;}
	public E getData() {
	    return data;
	}
	public void setNext(Node<E> n){
	    next = n;
	}
	public Node<E> getNext(){
	    return next;
	}
	public void SetPrev(Node<E> p){
	    prev = p;
	}
	public Node<E> getPrev(){
	    return prev;
	}
    }
    
    private Node<E> current;

    public void insert(E d){
	Node<E> n = new Node<E>(d);
	if (current==null){
	    current = n;
	}
	Node<E> tmp = current;
	tmp.prev = current.prev;
	tmp.next = current.next;
	while (tmp.prev != null){
	    tmp.getNext() = tmp;
	    tmp = tmp.getPrev(); 
	}
	n.next = tmp;
	tmp.prev = n;
	tmp = n;
    }
    
    public E getCurrent() {
	return current.getData();
    }

    public void forward(){
	if (current.getNext() != null){
	    current = current.getNext();
	}
    }

    public void back(){
	if (current.getPrev() != null){
	    current = current.getPrev();
	}
    }

    public String toString() {
	if (current == null){
	    return "";
	}
	Node<E> temp = current;
	while (temp.getPrev() != null){
	    temp = temp.getPrev();
	}
	String s = "";
	while (temp!=null){
	    s = s + temp.getData() + " ";
	    temp = temp.getNext();
	}
	return s;
    }

    public static void main (String[] args) {
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	System.out.println(L.getCurrent());
	System.out.println(L.current.getPrev());
	//First test up to here
	
	/*
	System.out.println(L.getCurrent());
	System.out.println(L);
	L.forward();
	System.out.println(L);
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
	//Then test again up to here
	*/
    }
}
	
