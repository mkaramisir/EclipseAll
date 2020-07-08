package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion5Interview {

	public static void main(String[] args) {
		/*
		 * Get number from user Type java code by using while loop, Write a program that
		 * prompts the user to input an integer. It should then find sum of the digits
		 * of that number.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter an integer");
		int num=scan.nextInt();
		int sum=0;
		while(num>0) {
			int lastDigit = num%10;
			sum=sum+lastDigit;
			num=num/10;
			scan.close();
		}System.out.println(sum);
		
	}

}
