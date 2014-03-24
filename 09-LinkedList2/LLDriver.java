public class LLDriver{
    
    public static void main(String[] args){
	MyLinkedList L = new MyLinkedList();
	System.out.println(L);
	L.add("Sully");
	System.out.println(L);
	L.add("Mike");
	System.out.println(L);
	L.add("Randall");
	System.out.println(L);
	L.add("Boo");
	System.out.println(L);

	//set method
	System.out.println("This should be Randall:" + L.set(2,"James"));
	//get method
	System.out.println("This should be James:" + L.get(2));
	//remove method
	System.out.println("This should be Sully:" + L.remove(0));
	//find method
	System.out.println("This should be 3:" + L.find("Boo"));
    }

}
