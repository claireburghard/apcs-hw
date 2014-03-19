public class MyLinkedList {
    private Node head;
    
    public MyLinkedList() {
	head = null;
    }

    public void add(String d){
	Node tmp = new Node(d);
	tmp.setNext(head); //you must do this first
	head = tmp; //you must do this second
    }
    
    //Gives you a null pointer error
    /*
    public String toString(){
	return "" + head + head.getNext();
    }
    */ 

    public String set(int i, String s){
        String answer = "";
        for (
    }

    public String get(int i){
    }

    public String remove(int i){
    }
    
    public String find(int i){
    }
    
    int length(){
    }

    
}
    
	
