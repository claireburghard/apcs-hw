public class MyLinkedList {

    private Node head;
    
    public MyLinkedList() {
	head = new Node(0);
    }

    public void add(String d){
	Node tmp = new Node();
	tmp.setNext(head.setNext()); //you must do this first
	head.setNext(tmp); //you must do this second
    }
    
    public String toString(){
        Node temp = head.getNext();
	String answer = "";
	while (temp != null){
	    answer = answer + temp + ",";
	    temp = temp.getNext();
	}
	return answer;
    }
 
    public String set(int i, String s){
        String answer = "";
	Node temp = head.getNext();
	int x = 0;
	while (x<=i){
	    temp = temp.getNext();
	    x++;
	    if (x==i){
		temp.setData(s);
		answer = temp.getData();
	    }
	}
	return answer;
    }

    public String get(int i){
	Node n = head.getNext();
	for (int x=0; x<i; x++){
	    n = n.getNext();
	}
	return n.getData();
    }

    public String remove(int i){
	Node n = head.getNext();
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
	Node temp = head.getNext();
	for (int i=0; i<this.length(); i++){
	    temp = temp.getNext();
	    answer++;
	    if (temp.toString() == s){
		return answer;
	    }
	}
	return answer;
    }
    
    public int length(){
	int answer = 0;
	Node n = head;
	while (n != null){
	    n = n.getNext();
	    answer++;
	}
	return answer;
    }

    
}
    
	
