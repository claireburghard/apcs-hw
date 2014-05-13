import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args) {

	Heap h = new HeapSort();

	h.add(27);
	h.add(2);
	h.add(95);
	h.add(4);
	System.out.println(h);

	System.out.println(h.remove());

	System.out.println(h);

	h.add(99);
	System.out.println(Arrays.toString(h.sort()));
	}
}
