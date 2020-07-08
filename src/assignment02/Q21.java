package assignment02;

import java.util.Scanner;

public class Q21 {
//Ask user to enter a 3 digit integer then find the sum of all digits of that number.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter 3 digits number.");
		int n = s.nextInt(), f = n % 10, n2 = n / 10, se = n2 % 10,  t = n / 100;
		s.close();
		System.out.println("sum of the digits= " + (f + se + t));

	}

}
