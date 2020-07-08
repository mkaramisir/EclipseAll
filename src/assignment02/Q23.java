package assignment02;

import java.util.Scanner;

public class Q23 {
	/*
	 * Ask user to enter a number, if the number is divisible by 5 print on the
	 * console “That number can be divided by 5.” If the number is not divisible by
	 * 5, print on the console “That number cannot be divided by 5.”
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int a = s.nextInt();
		s.close();

		if (a % 5 == 0) {
			System.out.println("that number can be divided by 5.");
		}

		if (a % 5 != 0) {
			System.out.println("that number can not be divided by 5.");
		}

	}
}
