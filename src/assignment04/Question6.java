package assignment04;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a character. If it is uppercase, output will be “Uppercase”
		 * Otherwise, the output will be “Lowercase” Solve by using if statement.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character.");
		char ch = scan.next().charAt(0);
		scan.close();
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Uppercase");

		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("lowercase");
		} else {
			System.out.println("This is neither lowercase nor uppercase.");
		}
	}

}
