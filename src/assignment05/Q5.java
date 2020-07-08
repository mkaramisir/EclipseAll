package assignment05;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a starting and an ending value, then print all even
		 * integers from starting value to ending value on the console in the same line.
		 * Put a space between the numbers. If the starting value is 5 and ending value
		 * is 11, output will be like: 6 8 10
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a starting value.");
		int startingValue=scan.nextInt();
		System.out.println("Enter a ending value.");
		int endingValue=scan.nextInt();
		for (int i = startingValue; i <endingValue+1; i++) {
		 String result= i%2==0?i+" ":"";
		System.out.print(result);	
		scan.close();}
	}

}
