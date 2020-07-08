package assignment05;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his/her first name, last name, and gender and “ _ ” between
		 * the words. Change all “ _ ” to “ / ” and all letters to “ * ” Output should
		 * be like:
		 *
		 */
		//      ****/*****/******/
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your first name, last name, and gender and “ _ ” between the words.");
		String input=scan.nextLine();
		System.out.println(input.replaceAll("_", "/").replaceAll("\\w","*"));
		scan.close();

	}

}
