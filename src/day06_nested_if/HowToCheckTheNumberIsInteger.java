package day06_nested_if;

import java.util.Scanner;

public class HowToCheckTheNumberIsInteger {

	public static void main(String[] args) {
		// type a program to check if a number integer or not
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number to check if it is integer or not");
		double num = scan.nextDouble();
		if (num == (int) num) {
			System.out.println("the number is integer");
		} else {
			System.out.println(" the number is not integer");

		}
		scan.close();
	}
}
