package assignment03;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a number for price of a shirt. If it is greater than $100,
		 * output will be “Expensive” If it is greater than $70, output will be “Not
		 * Expensive.” Otherwise, output will be “Cheap”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter shirt price.");
		float priceOfShirt = scan.nextFloat();
		scan.close();
		if (priceOfShirt > 100) {
			System.out.println("Expensive.");
		} else if (priceOfShirt > 70) {
			System.out.println("Not expensive.");
		} else {
			System.out.println("Cheap.");
		}

	}

}
