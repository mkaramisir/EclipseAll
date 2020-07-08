package day14_review_scope;

public class MethodCreation03 {

	public static void main(String[] args) {
		/*
		 * Task: Create a method outside of the main method like; Method will have two
		 * integer parameters and return the difference of them Call the method from
		 * inside the main method.
		 */
		System.out.println(differenceOfTwoNum2(5, 2));
	}
	
		// Every char has an integer value in Java; therefore, when you select int as a return type
		// and if your method returns char, you will not get error message. This is trick, be careful.

	public static int differenceOfTwoNum2(int num1, int num2) {
		/*
		 * int diff = num1 - num2; return diff;
		 */
		//That one works but longer and uses memory more; therefore, prefer the num1 - num2
		return num1 - num2;
	}

}
