package assignment02;

import java.util.Scanner;

public class Q6 {
	/* Ask user to enter seconds then convert seconds to hours. */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter to seconds.");
		int sec = s.nextInt();
		s.close();
		System.out.println(sec + " second is " + (sec / 60) + " hours.");

	}

}
