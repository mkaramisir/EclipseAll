package day10_for_loop_practice;

import java.util.Scanner;

public class ForLoopQuestion04 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a starting and a ending value for “for loop” Create a
		 * program to add all odd integers between the starting and the ending values.
		 * Print the sum on the console.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter loop starting value");
		int startingNum = scan.nextInt();
		System.out.println("enter loop starting value");
		int endingNum = scan.nextInt();
		
		int sum=0;
		for (int i = startingNum; i < endingNum ; i++) {
			if (i%2!=0) {
				sum=sum+i;
			}
			
		}System.out.println(sum);
		scan.close();
	}

}
