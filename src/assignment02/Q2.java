package assignment02;

import java.util.Scanner;

public class Q2 {
	/*
	 * Write Java program to allow the user to input two integer values and then the
	 * program prints the results of adding, subtracting, multiplying, and dividing
	 * among the two values.
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter two integer values");
		int i1 = s.nextInt(), i2 = s.nextInt();
		int addition = i1 + i2;
		int substraction = i1 - i2;
		int multipication = i1 * i2;
		int division = i1 / i2;
		s.close();
		System.out.println("addition= " + addition + "	substraction= " + substraction + "	multipication+ "
				+ multipication + "	division= " + division);
	}

}
