import java.util.*;
import java.io.*;

public class QuickSelect{

    public int quickselect(int[] a, int k, int low, int high){
	Random r = new Random();
	int pi = low + r.nextInt(high-low + 1);

	if (low < high){
	    
	    //sort through the array, putting everything smaller than the pivot on the left
	    //and everything larger than the pivot on the right
	    int[] temp = new int[high-low + 1];
	    int p = a[pi];
	    for (int i=low; i<high; i++){
		int x = i-low;
		if (a[i] < p){
		    temp[x] = a[i];
		}
	    }
	    for (int i=low; i<high; i++){
		int x = i-low;
		if (a[i] == p){
		    temp[x] = a[i];
		}
	    }
	    for (int i=low; i<high; i++){
		int x = i-low;
		if (a[i] > p){
		    temp[x] = a[i];
		}
	    }
	    
	    //copy back to original array 
	    for (int i=0; i<a.length-1; i++){
		a[i] = temp[i];
	    }

	    //check to see if our pivot index is k (what we are looking for)
	    //if not, perform recursive call
	    if (pi == k){
		return a[pi];
	    }
	    else if (pi < k){
		return quickselect(a, k, low, pi-1);
	    }
	    else if (pi > k){
		return quickselect(a, k, pi+1, high);
	    }
	}
	
	return a[low];
    }
}


	
