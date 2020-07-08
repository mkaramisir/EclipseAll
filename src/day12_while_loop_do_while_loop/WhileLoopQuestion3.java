package day12_while_loop_do_while_loop;

import java.util.Scanner;

public class WhileLoopQuestion3 {

	public static void main(String[] args) {
		/*
		 * Type java code by using while loop, Write a program that prompts the user to
		 * input a positive integer. It should then print factorial of that number.
		 */
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scan.nextInt();
        
        int product = 1;
        
        while(num>=1) {
            product = product*num;
            num--;
        }
        
        System.out.println(product);
		
        scan.close();
	}

}
