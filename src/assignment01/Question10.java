package assignment01;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your first name.");
		String firstName = s.nextLine();
		System.out.println("Please enter your last name.");
		String lastName = s.nextLine();
		System.out.println("What is your address?");
		String address = s.nextLine();
		s.close();
		System.out.println(firstName + " " + lastName + "\n" + address);
	}
}
