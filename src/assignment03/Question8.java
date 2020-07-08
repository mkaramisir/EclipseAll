package assignment03;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter any number. If it is integer, output will be “This is
		 * integer.” Otherwise, output will be “This is not integer.”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an any number.");
		double num = scan.nextDouble();
		scan.close();
		if (num == (int) num) {
			System.out.println("This is integer.");
		} else {
			System.out.println("This is not integer.");
		}
	}

}
