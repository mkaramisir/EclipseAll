package day08_review_switch;

import java.util.Scanner;

public class NestedTernaryLeapInterview {

	public static void main(String[] args) {
		/*
		 * Type java code by using nested ternary. Write a program to check if a year is
		 * leap year or not. If the year is divisible by 100 then it must be divisible
		 * by 400. If a year is not divisible by 100 then it must be divisible by 4.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the year");
		int x = scan.nextInt();
		String r = x % 100 == 0 ? (x % 400 == 0 ? "leap year" : "not leap year")
				: (x % 4 == 0 ? "leap year" : "not leap year");
		System.out.println(r);
		scan.close();

	}

}




