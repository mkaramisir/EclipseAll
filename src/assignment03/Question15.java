package assignment03;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter 2 letters. If user entered two uppercase letters, output
		 * will be “Good Job, both are uppercases.” If user entered two lowercase
		 * letters, output will be “Good Job, both are uppercases.” Otherwise, output
		 * will be “I am confused”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter 2 letters");
		String letter = scan.next();
		scan.close();
		if ((letter.charAt(0) >= 'A' && letter.charAt(0) <= 'A')
				&& (letter.charAt(1) >= 'A' && letter.charAt(1) <= 'A')) {
			System.out.println("Good Job, both are uppercases.");
		} else if ((letter.charAt(0) >= 'a' && letter.charAt(0) <= 'z')
				&& (letter.charAt(1) >= 'a' && letter.charAt(01) <= 'z')) {
			System.out.println("Good Job, both are uppercases.");
		} else {
			System.out.println("I am confused");
		}
	}

}
