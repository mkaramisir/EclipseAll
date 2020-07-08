package day06_nested_if;

import java.util.Scanner;

public class WarmUp6 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter annual salary, if the salary is more than or equal to
		 * $80.000 output will be “I accept the offer”, if the salary is between $60.000
		 * and $80.000 out put will be “I negotiate to increase”, otherwise output will
		 * be “I do not accept the offer.”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter offered annual salary");
		float annualSalary = scan.nextFloat();
		if (annualSalary >= 80000) {
			System.out.println("I accepted the offer.");
		} else if (annualSalary >= 60.000) {
			System.out.println("I negotiate to increase.");
		} else {
			System.out.println("I do not accept the offer.");
			scan.close();	}
	}
}