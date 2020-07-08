package day13_review_StringMethods_MethodCreation;

import java.util.Scanner;

public class MethodCreation01 {

	public static void main(String[] args) {
		/*
		 * Task: Create a method outsde of the main method like;
		 * Ask user to enter two numbers then print their product on the console
		 * Call the method from inside the main method
		 */
		
	multiplyTwoNum();
	}
	
	 public static void multiplyTwoNum() {
	    	Scanner scan = new Scanner(System.in);
			System.out.println(" enter 2 numbers ");
			double num1=scan.nextDouble();
			double num2=scan.nextDouble();
			System.out.println(num1*num2);
			scan.close();
	 }
}
