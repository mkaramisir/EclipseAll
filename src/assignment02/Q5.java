package assignment02;

import java.util.Scanner;

public class Q5 {
	/*
	 * Ask user to enter the price of an item that is on clearance (60% off), and
	 * user has a coupon for an additional 30% off the clearance. Calculate the
	 * final cost of the item.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a item price.");
		float itemPrice = s.nextFloat();
		s.close();
		float clearencePrice = itemPrice * 60 / 100;
		float finalPrice = clearencePrice * 30 / 100;
		System.out.println(" final price= " + finalPrice);

	}

}
