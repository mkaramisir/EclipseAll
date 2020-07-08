package day26_exepcitons;

public class Exceptions01 {
	// when you type a code , if you notice posibble errors,
	// you can use "throws" keyword with exception name to declare the possible
	// error

	// if you declare exception after method name , use "throws" keyword.
	// sometimes we will declare excaption inside the method body , then we will use
	// "throw" keyword

	public static void main(String[] args) throws ArithmeticException {

		System.out.println(division(12, 3));
		System.out.println(division(12, 0));

	}

	public static int division(int num1, int num2) {
		return num1 / num2;
	}

}