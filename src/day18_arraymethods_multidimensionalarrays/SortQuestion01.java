package day18_arraymethods_multidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortQuestion01 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter an integer array then print the array on the console Use
		 * sort method then print the array on the console
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array size");
		int length=scan.nextInt();
		int[] arr=new int[length];
		System.out.println("enter a array alements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			System.out.print(arr[i]+" ");
		}
	}

}
