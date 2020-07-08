package assignment02;

import java.util.Scanner;

public class Q7 {
	/*
	 * Ask user to enter weekly salary and the amount to save, then calculate how
	 * many months he needs to save
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter weekly salary and the amound to save");
		float wSalary = s.nextFloat();
		float savingAmount = s.nextFloat();
		s.close();
		float neededMonth = savingAmount / (wSalary * 4);
		int a = (int) neededMonth;

		System.out.println(a + " months you need to save");

	}

}
