package assignment01;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your first name.");
		String firstName = s.nextLine();
		System.out.println("Please enter your last name.");
		String lastName = s.nextLine();
		s.close();
		System.out.println("Your full name is " + firstName + " " + lastName + ".");
	}
}
