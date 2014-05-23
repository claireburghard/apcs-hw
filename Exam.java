import java.io.*;
import java.util.*;

public class Exam {
    
    // put any methods you need here
    
    public static void main(String[] args) {
	
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
