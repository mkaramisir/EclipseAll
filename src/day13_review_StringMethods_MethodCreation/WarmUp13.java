package day13_review_StringMethods_MethodCreation;

import java.util.Scanner;

public class WarmUp13 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his first and last name Make all letters of his first and
		 * last name “*” Print first name and last name on the console For example; if
		 * the name is “Ali Yilmaz”, output will be “*** ******”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String name=scan.nextLine();
		System.out.println(name.replaceAll("\\w","*"));
		System.out.println(name.replaceAll("\\S", "\\*"));
		scan.close();	}

}
