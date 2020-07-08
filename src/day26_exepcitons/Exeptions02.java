package day26_exepcitons;

public class Exeptions02 {

	public static void main(String[] args) throws ArithmeticException {

		division(12, 3);
		division(12, 0);
	}

	public static void division(int num1, int num2) {
		try {
			System.out.println("Result: " + num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("No number can be divided by zero");
		}
	}
}
