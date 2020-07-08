package day14_review_scope;

public class OverloadingRule2 {

	public static void main(String[] args) {
		/*
		 * Data type of parameters.
		 * 		add(int, int)
		 * 		add(int,String)
		 * 		add(float, String)
		 */

		overload02(0);
	}
	public static void overload02(int num1) {
		System.out.println("Changing parametter's data type is okay for overloading.");
	}
	public static void overload02(String str) {
		System.out.println("Changing parametter's data type is okay for overloading.");
	}
}
