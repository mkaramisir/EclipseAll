package day05_if_logicals;

import java.util.Scanner;

public class IfQuestion2 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter the values of length and width of a rectangle, then check
		 * if it is square or not.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter length and width values");
		float length = s.nextFloat();
		float width = s.nextFloat();
		
		if (length != width) {
			System.out.println("it is a rectange.");
		}
		if (length == width) {
			System.out.println("it is a square.");
		}s.close();
	}
}
