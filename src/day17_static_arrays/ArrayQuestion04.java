package day17_static_arrays;

import java.util.Scanner;

public class ArrayQuestion04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of the array");
		int length=scan.nextInt();
		System.out.println("enter the integer elements of array");
		int array[]=new int[length];
		
		for (int i = 0; i <length; i++) {
		array[i]=scan.nextInt();
		
		}
		for (int i = 0; i < array.length; i++) {
			if(i%2==0) {
			System.out.print(array[i]+" ");
			}
			scan.close();
		}
		
	}

}
