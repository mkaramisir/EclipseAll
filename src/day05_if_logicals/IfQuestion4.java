package day05_if_logicals;

import java.util.Scanner;

public class IfQuestion4 {

	public static void main(String[] args) {
		/*
		 * Type java code by using if statement. When you enter the name of the day of a
		 * week, output will be “Weekday” or “Weekend day” according to the name of the
		 * day.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the day of a week.");
		String dayOfTheWeek = scan.next();
		// while compare String do not use "=="
		// use equals() or equalIgnoreCase()
		//“==” checks the value and the address of the Strings However, equals() and equalsIgnoreCase() checks just values
		if (dayOfTheWeek.equalsIgnoreCase("Monday")) {
			System.out.println(dayOfTheWeek + " is weekday");
		}

		if (dayOfTheWeek.equalsIgnoreCase("Tuesday")) {
			System.out.println(dayOfTheWeek + " is weekday");
		}
		if (dayOfTheWeek.equalsIgnoreCase("Wednesday")) {
			System.out.println(dayOfTheWeek + " is weekday");
		}
		if (dayOfTheWeek.equalsIgnoreCase("Thursday")) {
			System.out.println(dayOfTheWeek + " is weekday");
		}
		if (dayOfTheWeek.equalsIgnoreCase("Friday")) {
			System.out.println(dayOfTheWeek + " is weekday");
		}
		if (dayOfTheWeek.equalsIgnoreCase("Saturday")) {
			System.out.println(dayOfTheWeek + " is weekend day");
		}
		if (dayOfTheWeek.equalsIgnoreCase("Sunday")) {
			System.out.println(dayOfTheWeek + " is weekend day");
		}scan.close();
	}
}
