package assignment05;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a starting and an ending value, then print the sum of all
		 * integers from starting value to ending value on the console. If the starting
		 * value is 5 and ending value is 11, output will be 56 because
		 * 5+6+7+8+9+10+11=56
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a starting value.");
		int startingValue=scan.nextInt();
		System.out.println("Enter a ending value.");
		int endingValue=scan.nextInt();
		int sum=0;
		for (int i = startingValue; i <endingValue+1; i++) {
			
			sum=sum+i;
			scan.close();	}System.out.println(sum);
		
	}

}
