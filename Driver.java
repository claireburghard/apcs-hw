public class Driver {

    public static void main (String[] args) {
	
	BST tree = new BST();

	tree.insert(2);
	tree.insert(7);
	tree.insert(8);
	tree.insert(50);
	tree.insert(1);
	tree.insert(5);
	tree.insert(11);

	tree.traverse(2);
    }
}
