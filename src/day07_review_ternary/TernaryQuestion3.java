package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion3 {

	public static void main(String[] args) {
		/*
		 * Type java code by using ternary. Write a program to print absolute value of
		 * an integer entered by user.
		 */
		
		Scanner scan = new Scanner(System.in);
	     System.out.println("Enter an integer.");
	     int num=scan.nextInt();
	     int result= num<0 ? num*-1: num;
	     System.out.println(result);
	     scan.close();
	}

}
