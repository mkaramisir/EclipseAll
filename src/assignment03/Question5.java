package assignment03;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a String. If the first letter of the String is “Z” and if
		 * it has more than 4 characters output will be “Good String.” Otherwise, output
		 * will be “Bad String”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String.");
		String str=scan.next();
		scan.close();
		if (str.charAt(0)=='Z' && str.length()>4){
			System.out.println("Good String.");
			
		} else {
			System.out.println("Bad String.");
		}

	}

}
