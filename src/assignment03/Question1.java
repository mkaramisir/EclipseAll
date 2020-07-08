package assignment03;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter an integer. If the number has 3 digits, output will be
		 * “This number has 3 digits.” Otherwise, output will be “This number has no 3
		 * digits.”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		//int num=scan.nextInt();
		//if (num>=100 && num<1000) 
		String num=scan.next();
		scan.close();
		if (num.length()==3){
			System.out.println("This number has 3 digits.");
			
		} else {System.out.println("This number has no 3 digits.");

		}
		
	}

}
