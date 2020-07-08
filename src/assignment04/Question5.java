package assignment04;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a two digits integer. If the sum of the digits of the
		 * integer is divisible by 3, output will be “The number is divisible by 3.”
		 * Otherwise, the output will be “This number is not divisible by 3.” Solve by
		 * using ternary.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two integer");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		scan.close();
		String result=
       (num1+num2)%3==0?
    		   "The number is divisible by 3."	: 
    			   "This number is not divisible by 3.";
		System.out.println(result);
	}

}
