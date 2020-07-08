package day08_review_switch;

import java.util.Scanner;

public class SwitchQuestion3 {

	public static void main(String[] args) {
		/*
		 * If the user pressed 1, 2, 3 the program will print the number that is
		 * pressed; otherwise, program will print “Not allowed”
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int num = s.nextInt();
		s.close();
		switch (num) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;

		default:
			System.out.println("Not allowed");
		}

	}

}
