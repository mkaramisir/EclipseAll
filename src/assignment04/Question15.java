package assignment04;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter an integer. If the integer is divisible by 5, output will
		 * be “Divisible by 5”, Otherwise, output will be “Not divisible By 5” Solve by
		 * using if statement.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please  enter an integer.");
		int num = scan.nextInt();
		scan.close();
		if (num%5==0 || num%5==5) {
			System.out.println("Divisible by 5.");
		} else {
			System.out.println("Not divisible By 5.");
		}
	}

}
