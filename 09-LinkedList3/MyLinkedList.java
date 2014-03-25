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
    
    public String toString(){
        Node temp = head;
	String answer = "";
	while (temp != null){
	    answer = answer + temp + ",";
	    temp = temp.getNext();
	}
	return answer;
    }
 
    public String set(int i, String s){
        String answer = "";
	Node temp = head;
	int x = 0;
	while (x<=i){
	    temp = temp.getNext();
	    if (x==i){
		answer = temp.getData();
		temp.setData(s);
	    }
	    x++;
	}
	return answer;
    }

    public String get(int i){
	Node n = head;
	for (int x=0; x<i; x++){
	    n = n.getNext();
	}
	return n.getData();
    }

    public String remove(int i){
	Node n = head;
	if (i==0){
	    head = head.getNext();
	    return n.getData();
	}
	for (int x=1; x<i; x++){
	    n = n.getNext();
	}
	Node rem = n.getNext();
	n.setNext(n.getNext().getNext());
	return rem.getData();
    }
    
    public int find(String s){
        int answer = 0;
	Node temp = head;
	for (int i=0; i<this.size(); i++){
	    temp = temp.getNext();
	    answer++;
	    if (temp.toString() == s){
		return answer;
	    }
	}
	return answer;
    }
    
    public int size(){
	int answer = 0;
	Node n = head;
	while (n != null){
	     answer++;
	    n = n.getNext();
	}
	return answer;
    }

    
}
    
	
