package day05_if_logicals;

import java.util.Scanner;

public class IfElseifQuestion3 {

	public static void main(String[] args) {
		/*
		 * Type java code by using if-else statement. Write a program to check if a year
		 * is leap year or not. If a year is divisible by 4 then it is leap year but if
		 * the year is divisible by 100 then it must be divisible by 400.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the year");
		int year = scan.nextInt();

		if (year % 400 == 0) {
			System.out.println("it is leap year");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("it is leap year");
		} else {
			System.out.println("it is not leap year");
		}scan.close();
	}

}

/*
 * How to Calculate Leap Years The year can be evenly divided by 4; If the year
 * can be evenly divided by 100, it is NOT a leap year, unless; The year is also
 * evenly divisible by 400. Then it is a leap year.
 */