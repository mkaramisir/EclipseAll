package day10_for_loop_practice;

import java.util.Scanner;

public class ForLoopQuestion05Interview {

	public static void main(String[] args) {

		/*
		 * Write a program to find the factorial value of any number entered through the
		 * keyboard. For example; If user enters 5, output will be 120 because 5x4x3x2x1
		 * = 120
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter loop starting value");
		long num = scan.nextLong();

		long product = 1;
		for (long i = 1; i <= num; i++) {
			product = product * i;

		}
		System.out.println(product);
		scan.close();
	}

}
