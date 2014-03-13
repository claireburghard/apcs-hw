import java.util.*;
import java.io.*;

public class Driver{
    
    public static void main(String[] args){
	
	QuickSelect q = new QuickSelect();
	int[] test = {4,5,1,88,9,5,4,33,2,66,74,34,12,13,14,16,17,12,19,23,14,25,66,7,1,7,2,9};
	System.out.println(q.quickselect(test,6,0,test.length));
    }
}
