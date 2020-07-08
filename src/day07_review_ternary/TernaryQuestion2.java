package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion2 {

	public static void main(String[] args) {
		/*
		 * Type java code by using ternary. Ask user to enter two integers Write a
		 * program to print the minimum one on the console.
		 */
		Scanner scan = new Scanner(System.in);
	     System.out.println("Enter two integer.");
	     int num1=scan.nextInt();
	     int num2=scan.nextInt();
	     
	     int result= num1 <= num2 ? num1 : num2;
	     System.out.println(result);
	     scan.close();
	}

}
