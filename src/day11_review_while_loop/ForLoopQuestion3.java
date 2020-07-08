package day11_review_while_loop;

import java.util.Scanner;

public class ForLoopQuestion3 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his/her last name, then print its inverse on the
		 * console.(Interview Question) If the last name is “Walker” output will be
		 * “reklaW”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your last name");
		String lastName=scan.nextLine();
		for (int i = lastName.length()-1; i >= 0; i--) {
			System.out.print(lastName.charAt(i));
		}scan.close();
		
	}

}
