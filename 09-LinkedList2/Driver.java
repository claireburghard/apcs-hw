import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[] args){
	Node n1;
	n1 = new Node("Sully");
	System.out.println(n1);
	System.out.println(n1.getNext());

	Node n2 = new Node("Mike");
	System.out.println(n2);
	System.out.println(n2.getNext());

	//Sully refers to Mike
	n1.setNext(n2);
	System.out.println();
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());

	//Mike refers to Randall
	n1.getNext().setNext(new Node("Randall"));
	System.out.println();
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext());
	
	//Delete Mike
	/*
	n1.setNext(n1.getNext().getNext());
	System.out.println();
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	*/
    }
}
