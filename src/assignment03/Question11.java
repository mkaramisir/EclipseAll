package assignment03;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a String. If it has more than 7 characters, output will be
		 * “Good.” If it has more than 4 characters, output will be “Not Bad.”
		 * Otherwise, output will be “Bad”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = scan.nextLine();
		scan.close();
		if (str.length() > 7) {
			System.out.println("Good ");
		} else if (str.length() > 4) {
			System.out.println("Not bad ");
		} else {
			System.out.println("Bad ");
		}

	}
}
