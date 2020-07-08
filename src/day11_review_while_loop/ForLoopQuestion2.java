package day11_review_while_loop;

import java.util.Scanner;

public class ForLoopQuestion2 {

	public static void main(String[] args) {
		/*
		 * Write a program that prompts the user to input a positive integer. It should
		 * then output a message indicating whether the number is a prime number. Hint:
		 * Prime numbers are not divisible by any number except 1 and the number itself
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an pozitif integer.");
		int num = scan.nextInt();
		boolean result = true;
		scan.close();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				result = false;
				break;
			}
		}

		if (result == true) {

			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
