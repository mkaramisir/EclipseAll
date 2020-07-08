package assignment05;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a starting and an ending value, then print the product of
		 * all integers from starting value to ending value on the console. If the
		 * starting value is 5 and ending value is 9, output will be 15120 because
		 * 5x6x7x8x9=15120
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a starting value.");
		int startingValue=scan.nextInt();
		System.out.println("Enter a ending value.");
		int endingValue=scan.nextInt();
		int result=1;
		for (int i = startingValue; i <=endingValue; i++) {
			result=result*i;
			scan.close();	}System.out.println(result);
	}

}
