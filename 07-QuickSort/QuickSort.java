import java.util.*;
import java.io.*;

public class QuickSort{

    public int[] qsort(int[] L){
	if (L.length <= 1){
	    return L;
	}
	else{
	    Random r = new Random();
	    int pi = r.nextInt(L.length/2);
	    ArrayList ltemp = new ArrayList();
	    ArrayList rtemp = new ArrayList();
	    int p = L[pi];
	    for (int i=0; i<L.length; i++){
		if (L[i] < p){
		    ltemp.add(L[i]);
		}
	    }
	    for (int i=0; i<L.length; i++){
		if (L[i] > p){
		    rtemp.add(L[i]);
		}
	    }
	    Integer[] left = ltemp.toArray(new Integer[0]);
	    Integer[] right = rtemp.toArray(new Integer[0]);
	    this.qsort(left);
	    this.qsort(right);
	    int x = 0;
	    for (int i=0; i<left.length; i++){
		L[x] = left[i];
		x++;
	    }
	    x = x+1;
	    L[x] = p;
	    for (int i=0; i<right.length; i++){
		L[x] = right[i];
		x++;
	    }
	}
    }
}
	    
	    
	    
