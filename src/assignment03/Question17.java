package assignment03;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter 3 chars. If user entered them in alphabetical order, output
		 * will be “Good Job, the chars are in alphabetical order.” If user entered just
		 * first two in alphabetical order, output will be “Just first two chars are in
		 * alphabetical order.” Otherwise, output will be “Put them in order”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a char1");
		char ch1 = scan.next().charAt(0);
		System.out.println("enter a char2");
		char ch2 = scan.next().charAt(0);
		System.out.println("enter a char3");
		char ch3 = scan.next().charAt(0);
		scan.close();
			
		
		if (ch1 < ch2 && ch2 < ch3) {
			System.out.println("Good Job, the chars are in alphabetical order.");
		} else if (ch1 < ch2 && ch3 < ch2) {
			System.out.println("Just first two in alphabetical order");
		} else {
			System.out.println("Put them in order");
		}
	}

}
