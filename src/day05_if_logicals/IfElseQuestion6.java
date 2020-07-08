package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion6 {

	public static void main(String[] args) {
		// Ask user to enter a character, then check whether the character is alphabet
		// or not
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a character");
		char character = scan.next().charAt(0);
		if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
			System.out.println("it is alphabet");
		} else {
			System.out.println("this is not an alphabet ");

		}scan.close();
	}

}
