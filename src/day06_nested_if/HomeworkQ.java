package day06_nested_if;

import java.util.Scanner;

public class HomeworkQ {

	public static void main(String[] args) {
		/*
		 * Type java code by using nested if statement, if a number is an integer and
		 * divisible by 3, output will be “Perfect number.” If the number is an integer
		 * and not divisible by 3, output will be “Good number.” If the number is not an
		 * integer and less than 10, output will be “Bad number.” If the number is not
		 * an integer and greater than or equal to 10, output will be “Ordinary number.”
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number");
		double num=scan.nextDouble();
		
		
		
		
		if (num==(int)num) {
			if (num % 3 == 0) {
				System.out.println("perfect number");

			} else {
				System.out.println("good number.");
			}
		}

		else  {
			if (num < 10) {
				System.out.println("Bad number.");

			} else {
				System.out.println("Ordinary number.");

			}
		}scan.close();

	}
}
