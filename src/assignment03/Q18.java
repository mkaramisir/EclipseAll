package assignment03;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a char. If user entered an uppercase letter then check if
		 * it is ‘A’ or ‘B’, output will be “You entered an uppercase letter and it is
		 * one of the first two uppercases.” If user entered a lowercase letter then
		 * check if it is ‘y’ or ‘z’, output will be “You entered an lowercase letter
		 * and it is one of the last two lowercases.”Otherwise, output will be “I do not
		 * know that char.”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a char");
		char ch = scan.next().charAt(0);
		scan.close();
		if (ch >= 'A' && ch <= 'Z') {
			if (ch == 'A' || ch == 'B') {
				System.out.println("You entered an uppercase letter and it is one of the first two uppercases.");
			} else {
				System.out.println("I do not know that char.");
			}
		}

		else if (ch >= 'a' && ch <= 'z') {
			if (ch == 'y' || ch == 'z') {
				System.out.println("You entered an lowercase letter nd it is one of the last two lowercases.");
			} else {
				System.out.println("I do not know that char.");
			}

		}

	}

}
