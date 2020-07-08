package assignment03;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter 2 names together with their birth years. Print their names
		 * on the console from young to old.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter name of the person 1");
		String person1Name = scan.next();
		System.out.println("enter name of the person 2");
		String person2Name = scan.next();
		System.out.println("enter birth year of the person 1");
		int person1BirthYear = scan.nextInt();
		System.out.println("enter birth year the person 2");
		int person2BirthYear = scan.nextInt();
		scan.close();
		if (person1BirthYear < person2BirthYear) {
			System.out.println(person2Name + " younger than " + person1Name);
		} else {
			System.out.println(person1Name + " younger than " + person2Name);

		}
	}
}