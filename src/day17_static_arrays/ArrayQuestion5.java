package day17_static_arrays;

import java.util.Scanner;

public class ArrayQuestion5 {

	public static void main(String[] args) {
		System.out.println(ArrayQuestion5.sum());
	
	}
	public static int sum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of the array");
		int length = scan.nextInt();
		int array[] = new int[length];
		int sum = 0;

		System.out.println("enter the integer elements of array");
		for (int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
			
			sum += array[i];
			
		}return sum;
		
	}
}
