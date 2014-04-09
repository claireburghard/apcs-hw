public class Driver {

	public static void main(String[] args) {

		RPN r = new RPN();
		System.out.println("this should be 9:" + r.operations("5 4 +"));
	        System.out.println("this should be 2:" + r.operations("5 4 + 7 -"));
		System.out.println("this should be 20:" + r.operations("5 4 + 7 - 10 *"));
	        System.out.println("this should be 10:" + r.operations("5 4 + 7 - 10 * 2 /"));

	}
}
