package assignment04;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter two words. If the length of the first and the second words
		 * are equal, output will be “Equal length.” Otherwise, the output will be “Not
		 * equal length” Solve by using ternary.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word1.");
		String word1=scan.next();
		System.out.println("Please enter a word2.");
		String word2=scan.next();
		scan.close();
		String result= word1.length()==word2.length()?
				"Equal length.":
					"Not equal length.";
		System.out.println(result);
		
	}

}
