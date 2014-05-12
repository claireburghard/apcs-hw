public class Node {
	    private int data;
	    private Node left, right;

	    public Node(int d) {
	    	data = d; 
	    	left = null;
	    	right = null;
	    }

	    public void setLeft(Node l) {
	    	left = l;
	    }

	    public Node getLeft() {
	    	return left;
	    }

	    public void setRight(Node r) {
	    	right = r;
	    }

	    public Node getRight() {
	    	return right; 
	    }

	    public void setData(int d) {
	    	data = d;
	    }

	    public int getData() {
	    	return data;
	    }

	}
