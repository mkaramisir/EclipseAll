package assignment02;

import java.util.Scanner;

public class Q8 {
	/*
	 * Ask user to enter number of days, then calculate the hours, minutes, and
	 * seconds.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please the number of days");
		int days = s.nextInt();
		s.close();
		int hours = days * 24;
		int minutes = hours * 60;
		int seconds = minutes * 60;

		System.out.println(days + " days " + "= " + hours + "hours " + minutes + "minutes " + seconds + "seconds.");

	}

}
