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
	Node temp = head;
	int x = 0;
	while (x<=i){
	    temp = temp.getNext();
	    x++;
	    if (x==i){
		temp.setData(s);
	    }
	}
	return answer;
    }

    public String get(int i){
    }

    public String remove(int i){
    }
    
    public String find(String s){
	String answer = "";
	Node temp = head;
	for (int i=0; i<this.length; i++){
	    temp = temp.getNext();
	    if (temp.toString() == s){
		answer = temp.toString();
		return answer;
	    }
	}
	return answer;
    }
    
    public int length(){
	int answer = 0;
    }

    
}
    
	
