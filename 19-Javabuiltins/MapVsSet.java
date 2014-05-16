import java.io.*;
import java.util.*;

public class MapVsSet {

    public static void main (String[] args) {

	Hashmap map = new Hashmap();
	Hashset set = new Hashset();
	long start,elapsed;

	//Inserting values into the map and set; no duplicate elements
	System.out.println("Inserting non-duplicate elements\n");
	
	int inserts = 1000;
	
	start = System.currentTimeMillis();
	for (int i = 0; i < inserts; i++){
	    map.put(i,i);
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println("Inserting " + inserts + " values into the map:");
	System.out.println("Time: "+elapsed+"\n");

	start = System.currentTimeMillis();
	for (int i = 0; i < inserts; i++){
	    set.add(i);
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println("Inserting " + inserts + " values into the set:");
	System.out.println("Time: "+elapsed+"\n");

	//Inserting values into the map and set; duplicate elements
	System.out.println("Inserting elements with duplicates");
	Random r = new Random();

	start = System.currentTimeMillis();
	for (int i = 0; i < inserts; i++){
	    rand = r.nextInt(inserts/2);
	    map.put(rand, rand);
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println("Inserting " + inserts + " values into the map:");
	System.out.println("Time: "+elapsed+"\n");

	start = System.currentTimeMillis();
	for (int i = 0; i < inserts; i++){
	    rand = r.nextInt(inserts/2);
	    set.add(rand);
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println("Inserting " + inserts + " values into the set:");
	System.out.println("Time: "+elapsed+"\n");

    }

}



	

	
