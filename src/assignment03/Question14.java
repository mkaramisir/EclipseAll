package assignment03;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter 3 integers. If user entered them in ascending order, output
		 * will be “Good Job, the numbers are in ascending order.” If user entered them
		 * in descending order, output will be “Good Job, the numbers are in descending
		 * order.” Otherwise, output will be “Put them in order”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 integer.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		scan.close();
		if (num1 < num2 && num2 < num3) {
			System.out.println("Good Job, the numbers are in ascending order.");
		} else if (num1 > num2 && num2 > num3) {
			System.out.println("Good Job, the numbers are in descending order.");
		} else {
			System.out.println("Put them in order");
		}

	}

}
