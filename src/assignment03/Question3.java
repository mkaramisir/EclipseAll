package assignment03;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a String. If the first letter of the String is “A”, output
		 * will be “This String is starting with ‘A’.” Otherwise, output will be “This
		 * String is not starting with ‘A’.”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String.");
		String str = scan.nextLine();
		scan.close();
		if (str.charAt(0) == 'A') {
			System.out.println("This String is starting with ‘A’.");

		} else {
			System.out.println("This String is not starting with ‘A’.");
		}

	}

}
