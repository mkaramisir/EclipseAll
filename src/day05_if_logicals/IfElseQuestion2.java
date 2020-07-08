package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion2 {

	public static void main(String[] args) {
		/*
		 * Type java code by using if-else statement, Write a program to print absolute
		 * value of a number entered by user. hint: *if the number is positive print the
		 * number without changing. if the number is negative print the number after
		 * multiplying (-1)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number");
		float number = scan.nextFloat();
		if (number >= 0) {
			System.out.println("Absulate value of number is :" + number);
		} else {
			System.out.println("Absulate value of number is :" + (-1)*number);
		}scan.close();

	}
}
