package day14_review_scope;

public class OverloadingRule3 {

	public static void main(String[] args) {
		  /* 3)Sequence of Data type of parameters.
        add(int, float)
        add(float, int)
 */
	

	}
	public static void overload03(int num, String str) {
		System.out.println("Switching parametter is okay for overloading.");
	}
	
	public static void overload03(String str, int num) {
		System.out.println("Switching parametter is okay for overloading.");
		
	}
}
