import java.util.*;
import java.io.*;

public class Node{
    private String data;
    private Node next; //referring to oneself by creating a Node-in-a-Node

    public Node(String d){
	data = d;
	next = null;
    }

    public void setData(String d){
	data = d;
    }
    public String getData(){
	return data;
    }
    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }

    public String toString(){
	return data;
    }
}

    