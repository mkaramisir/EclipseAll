package assignment02;

import java.util.Scanner;

public class Q24 {
	/*
	 * Ask user to enter a number, if the number is greater than 300 print on the
	 * console “That number is greater than 300.” If the number is not greater than
	 * 300, print on the console “That number is not greater than 300.”
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = s.nextInt();
		s.close();
		if (a > 300) {
			System.out.println("that number grater than 300.");

		}
		if (a < 300) {
			System.out.println("that number is not grater than 300.");
		}
	}

}
