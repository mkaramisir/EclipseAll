package assignment04;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a character. If it is uppercase, output will be “Uppercase”
		 * Otherwise, the output will be “Lowercase” Solve by using ternary.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character.");
		char ch = scan.next().charAt(0);
		scan.close();
		String result= (ch>='A'&& ch<='Z')?	"Uppercase":((ch>='a'&& ch<='z')?"lowercase":
					"This is neither lowercase nor uppercase.");
				System.out.println(result);
	}

}
