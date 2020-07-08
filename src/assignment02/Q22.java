package assignment02;

import java.util.Scanner;

public class Q22 {
	/*
	 * Ask user to enter a number, if the number is even print on the console “That
	 * number is even.” If the number is odd, print on the console “That number is
	 * odd.”
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = s.nextInt();
		boolean isTrue = a % 2 == 0;
		s.close();
		if (isTrue) {
			System.out.println("that number is even");
		}
		boolean isFalse = a % 2 == 1;

		if (isFalse) {
			System.out.println("that number is odd");

		}

	}
}
