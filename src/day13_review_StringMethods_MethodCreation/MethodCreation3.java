package day13_review_StringMethods_MethodCreation;

public class MethodCreation3 {

	public static void main(String[] args) {
		/*
		 * Create a method with parameters outside of the main method Method should
		 * calculate the sum of two numbers and print them on the console Call the
		 * method from inside main method with arguments
		 */
		calculateSum(3.4, 1.8);
		calculation(2, 3);
		calculation(2, 3, 4);
		calculation(5, "7");
		
		// If you change the number of parameters, or the data type of parameters
	}
	public static void calculation(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public static void calculation(int num1, int num2, int num3) {
		System.out.println(num1+num2+ num3);
	}
	public static void calculation(int num1, String num2) {
		System.out.println(num1+num2);
	}

	public static void calculateSum(double num1, double num2) {
		System.out.println(num1 + num2);
	}

}
