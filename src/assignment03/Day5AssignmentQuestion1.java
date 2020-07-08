package assignment03;

import java.util.Scanner;

public class Day5AssignmentQuestion1 {

	public static void main(String[] args) {
		/*
		 * Type java code by using if-else if() statement. A school has following rules
		 * for grading system: 1. Below 50 - D 2. 50 to 60 - C 3. 60 to 80 - B. 4. Above
		 * 80 - A Ask user to enter marks and print the corresponding grade.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter grade as a integer value.");
		int grade = scan.nextInt();
		scan.close();
		if (grade > 0 && grade <= 49) {
			System.out.println("Corrisponding grade id D ");
		} else if (grade == 50 || grade <= 59) {
			System.out.println("Corrisponding grade id C");
		} else if (grade == 60 || grade <= 79) {
			System.out.println("Corrisponding grade id B ");
		} else if (grade == 80 || grade <= 100) {
			System.out.println("Corrisponding grade id A ");
		} else {
			System.out.println("invalid entery");

		}
	}
}
