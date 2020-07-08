package assignment04;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a two digits integer. If the sum of the digits of the
		 * integer is divisible by 3, output will be “The number is divisible by 3.”
		 * Otherwise, the output will be “This number is not Divisible by 3.” Solve by
		 * using if statement.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two integer");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		if ((num1 + num2) % 3 == 0) {
			System.out.println("The number is divisible by 3.");

		} else {
			System.out.println("This number is not divisible by 3.");
		}
	}

}
