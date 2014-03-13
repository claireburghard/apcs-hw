import java.util.*;
import java.io.*;

public class Driver{
    
    public static void main(String args[]){
	
	QuickSort q = new QuickSort();
	int[] test = {2,66,4,5,9,34,2,6,7,5,88,5,3,76,3,6,4,1,32,12,1,75,3,7,32,6,32,4,5,22};
	q.qsort(test);
	for (int i=0; i<test.length; i++){
	    System.out.println(test[i]);
	}
    }
}
