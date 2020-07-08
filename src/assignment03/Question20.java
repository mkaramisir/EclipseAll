package assignment03;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a his/her name. If its length is more than 4 then check if
		 * its first char is uppercase letter, output will be “Good.” If its length is
		 * less than 4 then check if its first char is lowercase letter, output will be
		 * “Not Bad.” Otherwise, output will be “I did not like that name.”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		scan.close();
		if (name.length() > 4) {
			if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
				System.out.println("Good.");
			} else {
				System.out.println("I did not like that name.");
			}
		} else {
			if (name.length() < 4) {
				if (name.charAt(0) >= 'a' && name.charAt(0) <= 'z') {
					System.out.println("Not bad.");
				} else {
					System.out.println("I did not like that name.");
				}
			}
		}
	}

}
