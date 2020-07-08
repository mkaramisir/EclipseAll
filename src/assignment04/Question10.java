package assignment04;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter two words. If the length of the first and the second words
		 * are equal, output will be “Equal length.” Otherwise, the output will be “Not
		 * equal length” Solve by using if statement.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word1.");
		String word1 = scan.next();
		System.out.println("Please enter a word2.");
		String word2 = scan.next();
		scan.close();
		if (word1.length() == word2.length()) {
			System.out.println("Equal length.");
		} else {
			System.out.println("Not equal legnth.");
		}

	}

}
