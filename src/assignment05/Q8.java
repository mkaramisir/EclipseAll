package assignment05;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		/*
		 * 8)Ask user to enter his/her first name, then print the letters of the first
		 * name on the console from top to down. If the first name is John out put will
		 * be like; 
		 * J
		 * o
		 * h
		 * n
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name.");
		String firstName=scan.next();
		for (int i = 0; i < firstName.length(); i++) {
			System.out.println(firstName.charAt(i));
			scan.close();	}
	}

}
