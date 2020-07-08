package day05_if_logicals;

import java.util.Scanner;

public class IfElseIfQuestion2 {

	public static void main(String[] args) {

		/*
		 * Type java code by using if-else if() statement, If age is less than 13 output
		 * will be “Should not work”, If age is greater than 65 output will be
		 * “Retired”, Otherwise; output will be “Should work”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age.");
		byte age = scan.nextByte();
		if (age < 13) {
			System.out.println("Should not work");
		} else if (age > 65) {
			System.out.println("Retired");
		} else {
			System.out.println("Should work");
		}
		scan.close();
	}

}
