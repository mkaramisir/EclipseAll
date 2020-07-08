package day08_review_switch;

import java.util.Scanner;

public class SwitchQuestion5 {

	public static void main(String[] args) {
		/*
		 * Type java code by using switch statement. A school has following rules for
		 * grading system: 1. Below 50 - C 2. 50 to 80 - B. 4. Above 80 - A Ask user to
		 * enter marks and print the corresponding grade.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your mark");
		int mark = scan.nextInt();
		String grade = "grade";
		scan.close();
		if (mark >= 0 && mark < 50) {
			grade = "C";
		} else if (mark >= 50 && mark < 80) {
			grade = "B";
		} else if (mark >= 80 && mark <= 100) {
			grade = "A";

		}

		switch (grade) {

		case "A":
			System.out.println("Your grade is A");
			break;
		case "B":
			System.out.println("Your grade is B");
			break;
		case "C":
			System.out.println("Your grade is C");
			break;
		default:
			System.out.println("Please enter a valid mark");

		}

	}
}
