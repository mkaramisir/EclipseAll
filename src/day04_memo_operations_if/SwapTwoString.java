package day04_memo_operations_if;

import java.util.Scanner;

public class SwapTwoString {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	//Ask user to enter two integer values. Write a Java Program to swap two numbers by using the third variable.
	// interview question
	System.out.println("please enter two integer value");
	int numA=s.nextInt();
	int numB=s.nextInt();
	System.out.println("Before swaping :"+numA+"<==>"+numB);
	int numNew=0;
	numNew=numA;
	numA=numB;
	numB=numNew;
	
	System.out.println("After swaping: "+numA+"<==>"+numB);
	s.close();


	}

}
