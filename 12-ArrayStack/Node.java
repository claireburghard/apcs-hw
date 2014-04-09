import java.util.*;
import java.io.*;


public class Node {

    private String data;
    private Node next;

    public Node(String d) {
	data = d;
	next = null;
    }

    public void setData(String d) {
	data = d;
    }
    public String getData() {
	return data;
    }
    public void setNext(Node n){
	next = n;
    }
    public Node getNext() {
	return next;
    }
    public String toString() {
	return ""+data;
    }

}public class Node<E> {
    private E data;
    private Node<E> next;

    public Node<E>(E d) {
	data = d;
	next = null;
    }

    public void setData(E d) {
	data = d;
    }
    public E getData() {
	return data;
    }
    public void setNext(Node<E> n) {
	next = n;
    }
    public Node<E> getNext() {
	return next;
    }

    public String toString() {
	return "" + data;
    }

}
