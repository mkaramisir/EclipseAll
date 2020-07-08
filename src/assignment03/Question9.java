package assignment03;

import java.util.Scanner;

public class Question9 {
	// Ask user to enter three integers. Print them on the console in ascending
	// order.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 3 integer numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		scan.close();
		if (num1 < num2 && num2 < num3) {
			System.out.println(num1 + " " + num2 + " " + num3);
		}
		if (num1 < num2 && num2 > num3 && num1 < num3) {
			System.out.println(num1 + " " + num3 + " " + num2);
		}
		if (num2 < num1 && num1 < num3) {
			System.out.println(num2 + " " + num1 + " " + num3);
		}
		if (num2 < num1 && num1 > num3 && num2 < num3) {
			System.out.println(num2 + " " + num3 + " " + num1);
		}
		if (num3 < num1 && num1 < num2) {
			System.out.println(num3 + " " + num1 + " " + num2);
		}
		if (num3 < num1 && num1 > num2 && num3 < num2) {
			System.out.println(num3 + " " + num2 + " " + num1);
		}

	}
}
