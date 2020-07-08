package assignment04;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a word which has 4 letters. If the first and the last
		 * letters of the word are same, output will be “Same” Otherwise, the output
		 * will be “Different” Solve by using ternary.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word which has 4 letters.");
		String word=scan.next();
		scan.close();
		String result= word.charAt(0)==word.charAt(3)?"same":"Different";
		System.out.println(result);
	}

}
