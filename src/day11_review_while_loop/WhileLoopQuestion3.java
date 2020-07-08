package day11_review_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion3 {

	public static void main(String[] args) {
		/*
		 * Type java code by using while loop, Write a program that prompts the user to
		 * input a positive integer. It should then print the multiplication table of
		 * that number
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = scan.nextInt();
		int i = 1;
		System.out.println("Multiplication table of " + num + " :");
		while (i <= 10) {
			System.out.println(i + "x" + num + "=" + i * num);
			i++;
		}scan.close();
	}
}
