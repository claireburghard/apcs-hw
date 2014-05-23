import java.io.*;
import java.util.*;

public class io {
    
    public static void main(String[] args){

	ArrayList<String> a = new ArrayList<String>();
	a.add("A");
	a.add("B");
	a.add("C");
	a.add("D");
	a.add("E");

	String alphabet = "";
	
	for (int i=0; i <a.size(); i++){
	    alphabet += a.get(i);
	}
			 
	PrintWriter out=null;
	try {
	    
	    out = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")));
	    out.println("Hello my name is Claire");
	    out.println(alphabet);
	} catch (Exception e){};
	
	out.print ("HELLO");
	out.println (" World!");
	out.close ();
	
	
    }
	

}
