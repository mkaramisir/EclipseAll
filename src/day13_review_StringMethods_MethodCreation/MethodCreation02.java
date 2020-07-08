package day13_review_StringMethods_MethodCreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		/*
		 * TASK: Create a method outside of the main method Ask user to enter two
		 * numbers Ask user which operation he wants to do Print the result after doing
		 * the operation which user asked Call the method from inside the main method
		 */

		simpleCalculator();
	}

	public static void simpleCalculator() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = scan.nextInt();
		System.out.println("enter another number");
		int num2 = scan.nextInt();
		System.out.println("Select one of the +, -, *, /");
		char operation = scan.next().charAt(0);

		switch (operation) {
		case '+':
			System.out.println("sum of two numbers: " + (num1 + num2));
			break;
		case '*':
			System.out.println("multiplication of two numbers: " + num1 * num2);
			break;
		case '/':
			System.out.println("Division of two numbers: " + num1 / num2);
			break;
		case '-':
			System.out.println("result of subtraction: " + (num1 - num2));
			break;
		default:
			System.out.println("Please use one of the +, -, *, /");
			scan.close();	}

	}

}
