package day17_static_arrays;

import java.util.Scanner;

public class ArrayQuestion6 {

	public static void main(String[] args) {
		//interview
		/*
		 * Reverse an array For example, {1,2,3} ----> {3,2,1}
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the length");
		int length = scan.nextInt();
		int arr[] = new int[length];

		System.out.println("Enter the integer elements of the array");
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextInt();
		}

		int reverseArray[] = new int[length];
		for (int i = 0; i < length; i++) {
			reverseArray[i] = arr[length - 1 - i];
			System.out.print(reverseArray[i] + " ");

		}
		scan.close();
	}
}