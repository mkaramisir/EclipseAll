package assignment04;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a three digits integer. If the first and last digits of the
		 * number are same out put will be “Mirror number.” If all digits are same,
		 * output will be “Perfect number.” Otherwise, output will be “Ordinary number.”
		 * Solve by using if - else if() statement. (Try to solve, if you cannot no
		 * worries, this is difficult. I will solve on Saturday)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 3 digits integer");
		int num = scan.nextInt();
		scan.close();
		if (num % 10 == num / 100 && num % 10 != (num / 10) % 10) {
			System.out.println("Mirror number.");
		} else if (num % 10 == (num / 10) % 10) {
			System.out.println("Perfect number.");
		} else {
			System.out.println("Ordinary number");
		}
	}

}
