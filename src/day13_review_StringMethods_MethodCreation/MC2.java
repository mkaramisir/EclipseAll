package day13_review_StringMethods_MethodCreation;

import java.util.Scanner;

public class MC2 {

	public static void main(String[] args) {
		/*
		 * TASK: Create a method outside of the main method Ask user to enter two
		 * numbers Ask user which operation he wants to do Print the result after doing
		 * the operation which user asked Call the method from inside the main method
		 */
		simpleCalculator();
	}  public static void simpleCalculator() {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Select one of the +, -, *, /");
        char op = scan.next().charAt(0);
        
        switch(op) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Enter a valid operation symbol");
                scan.close();  }

	}

}
