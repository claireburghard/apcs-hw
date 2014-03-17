import java.util.*;
import java.io.*;

public class QuickSort{

    public Integer[] qsort(Integer[] L){
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

    public int partition(int[] a, int L, int R){
	Random r = new Random();
	int pi = r.nextInt(a.length);
	int p = a[pi];
	a[pi] = a[R];
	a[R] = p;
	int wall = L;
	for (int i=L; i<R-1; i++){
	    if (a[i] < p){
		//switch wall and a[i]
		//wall++
	    }
	}
    }
	
}
	    
	    
	    
