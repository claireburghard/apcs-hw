import java.io.*;
import java.util.*;

public class BST {

    public Node root;

    public BST() {
	root = null;
    }

    public void insert(Node n){

	if (root == null){
	    root = n;
	}
	
        Node current = root;
	Node previous = null;
	
	while (current != null){
	    if (d <= current.getData()) {
		previous = current; 
		current = current.getLeft();
	    } else {
		previous = current; 
		current = current.getRight();
	    }
	    
	    if (d <= previous.getData()) {
		prev.setLeft(new Node(d));
	    } else {
		prev.setRight(new Node(d));
	    }
	}
    }

    public node search (int x){

	Node tmp = root;
	while (tmp != null && tmp.getData() != x) {
	    if (x < tmp.getData()) {
		tmp = tmp.getLeft();
	    } else {
		tmp = tmp.getRight();
	    }
	}
	return tmp;
    }

    public void traverse (Node n){
	if (n == null){
	    return;
	}
	else{
	    System.out.println(n);
	    Node temp =  n.getLeft();
	    traverse(temp);
	    temp = n.getRight();
	    traverse(temp);
	}
    }

}
