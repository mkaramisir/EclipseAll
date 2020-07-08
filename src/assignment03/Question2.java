package assignment03;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Ask user to enter two integers. Print them on the console in ascending order.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 integer");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		if (num1 > num2) {
			System.out.println(num2 + "  " + num1);
		} else {
			System.out.println(num1 + "  " + num2);
		}
	}

}
