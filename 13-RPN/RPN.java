import java.util.*;
import java.io.*;

public class RPN {

	public int operations(String s) {
		ArrayStack stack = new ArrayStack();
		int calc = 0;
		String temp = "";
		for (int i = 0; i<s.length(); i++) {
		    if (s.charAt(i) > 47 && s.charAt(i) < 58) { //if s is a number, we store the number in temp.
				temp = temp + s.substring(i,i+1);
		    }
		    else if (s.charAt(i) == 32 && temp != "") { //if s is a space, and there is something in temp,  we push the number we have recently stored in temp.
			stack.push(temp);
			temp = "";
		    }
		    else if (s.charAt(i) == 43) { //if s is a plus(+), we take the two top numbers, pop them, add them, then push the new value. 
			calc = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
			stack.push("" + calc);
		    }
		    else if (s.charAt(i) == 42) { //if s is a multipication(*), we take the two top numbers, pop them, multiply them, then push the new value.
			calc = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());
			stack.push("" + calc);
		    }
		    else if (s.charAt(i) == 45) { //if s is a minus(-), we take the two top numbers, pop them, then subtract the first from the second, then push the new value.
			calc = Integer.parseInt(stack.pop());
			calc = Integer.parseInt(stack.pop())-calc;
			stack.push("" + calc);
		    }
		    else if (s.charAt(i) == 43) { //if s is a division(/), we take the two top numbers, pop them, then divide the second by the first, then push the new value. 
			calc = Integer.parseInt(stack.pop());
			calc = Integer.parseInt(stack.pop())/calc;
			stack.push("" + calc);
		    }
		}
		return Integer.parseInt(stack.pop()); //returns the top of the stack, which is the answer of the equation. 
	}
    
}
