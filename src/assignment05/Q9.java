package assignment05;

import java.util.Scanner;

public class Q9 {
	/*
	 * Ask user to enter his/her last name, then print its inverse on the console.
	 * (Interview Question) If the last name is Walker output will be reklaW
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your name.");
		String firstName = scan.next();
		for (int i = firstName.length() - 1; i >= 0; i--) {
			System.out.print(firstName.charAt(i));

			scan.close();
		}
	}
}
