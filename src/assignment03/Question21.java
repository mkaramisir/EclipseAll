package assignment03;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his/her birth year and gender. If his/her age is less than
		 * 40 then check the gender if the gender is male, output will be “You are not
		 * an old man.” If his/her age is more than or equal to 50 then check the gender
		 * if the gender is female, output will be “Maybe you are
		 * grandmother.”Otherwise, output will be “You are good.”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your birth year");
		int birthYear = scan.nextInt();
		System.out.println("Enter your gender.");
		String gender = scan.next();
		int currentYear = 2020;
		int age = currentYear - birthYear;
		scan.close();
		if (age < 40) {
			if (gender.equalsIgnoreCase("male")) {
				System.out.println("You are not old man.");
			}else {
				System.out.println("you are good.");
			}
		} else if (age >= 50) {
			if (gender.equalsIgnoreCase("female")) {
				System.out.println("Maybe you are grandmother.");
			} else {
				System.out.println("you are good.");

		}} else {
			System.out.println("you are good.");

		}

	}

}
