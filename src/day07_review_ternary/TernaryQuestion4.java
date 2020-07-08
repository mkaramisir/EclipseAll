package day07_review_ternary;

import java.util.Scanner;

public class TernaryQuestion4 {

	public static void main(String[] args) {
		/*
		 * Type java code by using using ternary. Take values of length and  of a
		 * rectangle from user and check if it is square or not.
		 */
		
		Scanner scan = new Scanner(System.in);
	     System.out.println("Enter a lenght and breadth.");
	     int length=scan.nextInt();
	     int breadth=scan.nextInt();
	     String result= length==breadth ? "it is square":"it is not square";
	     System.out.println(result);
	     scan.close();
	}

}
