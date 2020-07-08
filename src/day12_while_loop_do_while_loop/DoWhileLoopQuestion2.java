package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class DoWhileLoopQuestion2 {

	public static void main(String[] args) {
		/*
		 * Type java code by using do-while loop, Write a program that prompts the user
		 * to input a positive integer. It should then print the digits which have odd
		 * indexes.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer.");
		String num=scan.next();
		int length=num.length();  //flag
		int i=1; //flag
		
		
		
		do {
			System.out.print(num.charAt(i));
			i+=2;
		} while (i<length);
		scan.close();
		
	}
}
