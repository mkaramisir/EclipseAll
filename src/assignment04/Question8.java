package assignment04;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a word which has 4 letters. If the first and the last
		 * letters of the word are same, output will be “Same” Otherwise, the output
		 * will be “Different” Solve by using if statement.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word which has 4 letters.");
		String word = scan.next();
		scan.close();
		if (word.charAt(0) == word.charAt(3)) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
	}

}
