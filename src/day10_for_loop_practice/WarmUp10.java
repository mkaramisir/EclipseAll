package day10_for_loop_practice;

import java.util.Scanner;

public class WarmUp10 {

	public static void main(String[] args) {
		/*
		 * Ask user ta enter his/her first name, last name and Social Security Number.
		 * Then type a program which makes initials of the first name and the last name
		 * in uppercase, other characters will be in lowercase. all characters except
		 * last 4 characters of the Social Security Number ” * “. For example; Suleyman
		 * Alptekin *****5678
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your fist  name ");
		String firstName = scan.next();
		System.out.println("Please enter your last  name ");
		String lastName = scan.next();
		System.out.println("Please enter your social security number ");
		String ssn = scan.next();

		String strFirst = firstName.substring(0, 1).toUpperCase();
		String strFirstOthers = firstName.substring(1).toLowerCase();
		String strLast = lastName.substring(0, 1).toUpperCase();
		String strLastOthers = lastName.substring(1).toLowerCase();
		System.out.println(strFirst + strFirstOthers);
		System.out.println(strLast + strLastOthers);
		String ssnWithStar=ssn.substring(0,5).replaceAll("\\d", "*");
		String ssnLast4digits=ssn.substring(5);
		System.out.println(ssnWithStar+ssnLast4digits);
		
		scan.close();
	}

}
