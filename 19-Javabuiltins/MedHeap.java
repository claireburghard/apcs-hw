import java.util.*;
import java.io.*;


public class MedHeap{

    private int median;
    private PriorityQueue minheap;
    private PriorityQueue maxheap;

    public MedHeap(){
	PriorityQueue minheap = new PriorityQueue();
	PriorityQueue maxheap = new PriorityQueue();
	int median = 0;
    }

    public int getMedian(){
	return median;
    }

    public void add(int x){
	if(x < med){
	    minheap.add(x);
	}else{
	    maxheap.add(x);
	}
	if(minheap.size() - maxheap.size() > 1){
	    int temp = minheap.peek();
	    minheap.poll();
	    maxheap.add(temp);
	}else if(maxheap.size() - minheap.size() > 1){
	    int temp = maxheap.peek();
	    maxheap.poll();
	    minheap.add(temp);
	}
	update();
    }

    public int removeMedian(){
	if(median == minheap.peek())
	    minheap.poll();
	else if(median == maxheap.peek())
	    maxheap.poll();
	else{
	    minheap.poll();
	    maxheap.poll();
	}
	int temp = median;
	update();
	return temp;
    }

    private void update(){
	if(minheap.size() == maxheap.size())
	    median = (minheap.peek() + maxheap.peek()) / 2;
	else if(minheap.size() > maxheap.size())
	    median = minheap.peek();
	else
	    median = maxheap.peek();
    }
    public static void main(String[] arrrgs){
	MedHeap a = new MedHeap();
	a.add(10);
	a.add(3);
	a.add(18);
	a.add(13);
	a.add(16);
	a.add(1);
	a.add(7);
	a.add(24);
	System.out.println(a.remove());
    }

}
