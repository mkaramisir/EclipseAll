package assignment02;

import java.util.Scanner;

public class Q4 {
	/*
	 * Ask user to enter the milage, then calculate the cost of the trip if gas is
	 * $2.50 a gallon and the car gets 36 miles per gallon
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter  milage for you trip.");
		float milage = s.nextFloat();
		s.close();
		float trip = (milage / 36) * 2.50f;
		System.out.println("Trip cost is $" + trip);

	}

}
