import java.io.*;
import java.util.*;

public class ArrayStack {

    //the stack is an Array of strings.
    private String[] stack;

    //the top is located by the index of the top value in the Array.
    private int top;
    
    //constructor
    //the top is set to length-1 because it begins at the last element of the array
    //and ends at the 0th element of the array (so, the stack is sort of backwards).
    public ArrayStack() {
	stack = new String[10];
	top = stack.length-1;
    }
    
    //grow
    //the temp Array is the larger array. We copy everything into that Array,
    //then set the stack to temp, and push the top back. 
    public void grow() {
	String[] temp = new String[stack.length+5];
	for (int i = 0; i <stack.length; i++) {
	    temp[i+5] = stack[i];
	}
	stack = temp;
	top = top + 5;
    }
    
    //push
    public void push(String d) {
	if (stack[top] == null) { //if the array is empty, put in d.
	    stack[top] = d;
	    return;
	}
	else if (top == 0){ //if the top of the stack is 0, that means its full, so grow.
	    grow();
	}
	top--; //the top moves up
	stack[top] = d; //setting the top as the new element
    }
    
    //pop
    public String pop() {
	String s = stack[top];
	if (top == stack.length-1){ //if there's one element, the stack should become null.
	    stack[top] = null;
	}
	else{
	    top++; //by moving the top (the only element we can see), we make the stack smaller.
	}
	return s;
    }
    
    //peek
    public String peek() {
	return stack[top];
    }
    
    //toString
    public String toString() {
	String s = "";
	for (int i = top; i<stack.length; i++){
	    s = s + stack[i] + ", ";
	}
	return s;
    }
    
}
