package assignment03;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter first name and last name. If the first name and the last
		 * name are same, output will be “Your first name and last name are same.” If
		 * the first name is longer than the last name, output will be “Your first name
		 * is longer than your last name.” Otherwise, output will be “Okay no problem.”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = scan.next();
		System.out.println("Enter last name");
		String lastName = scan.next();
		scan.close();
		if (firstName.equalsIgnoreCase(lastName)) {
			System.out.println("Your first name and last name are same.");
		} else if (firstName.length() > lastName.length()) {
			System.out.println("Your first name is longer than your last name. ");
		} else {
			System.out.println("Okay no problem.");
		}

	}

}
