package assignment05;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his/her first name, then change every letter to the next
		 * letter. (First name should not contain the letter “Z” or “z”) If the first
		 * name is Abc output will be Bcd
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your name.");
		String firstName = scan.next();
		String collect = "";
		scan.close();
		for (int i = 0; i < firstName.length(); i++) {
			int n = firstName.charAt(i)+1;
			collect = collect + (char) n;

		}System.out.println(collect);

	}

}
