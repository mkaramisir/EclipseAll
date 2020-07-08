package assignment05;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a password which has two words and a space between the
		 * words. Change the initials of the words to “ * ” Output should be like: *ohn
		 * *alker
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter two words");
		String password=scan.nextLine();
		char firstInitial=password.charAt(0);
		firstInitial='*';
		int space=password.indexOf(" ");
		char secondInitial=password.charAt(space+1);
		secondInitial='*';
		scan.close();
		System.out.println(firstInitial+password.substring(1,space)
		+password.charAt(space) +secondInitial+password.substring(space+2));
	

		
	}

}
