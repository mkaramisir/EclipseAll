package assignment02;

import java.util.Scanner;

public class Q3 {
	/*
	 * Ask user to enter a figure, then draw a square by using that figure. Similar
	 * to the given square
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a figure");
		String a = s.next();
		s.close();
		System.out.println(a + a + a + a + a + a + a + a + a + a + "\n" + a + "        " + a + "\n" + a + "        " + a
				+ "\n" + a + a + a + a + a + a + a + a + a + a);
	}

}
