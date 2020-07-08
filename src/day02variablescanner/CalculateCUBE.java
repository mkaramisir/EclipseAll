package day02variablescanner;

import java.util.Scanner;

public class CalculateCUBE {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("please enter an integer value to calculate its cube.");
	int num1=scan.nextInt();
	System.out.println("cube of the number is "+ (num1*num1*num1));
	scan.close();
	}

}
