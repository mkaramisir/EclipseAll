package day05_if_logicals;

import java.util.Scanner;

public class IfElseQuestion5 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his/her age and gender. If the age is more than 65 and the
		 * gender is male then output will be “Hey man you retired!” or the age is more
		 * than 60 and the gender is female then output will be “Hey lady you retired”
		 * else output will be “No need to work”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your age and gender.");
		int age = scan.nextInt();
		String gender=scan.next();
		
		if (age>65 && gender.equalsIgnoreCase("male")) {System.out.println("Hey man you retired!");
			
		}
		if (age>60 && gender.equalsIgnoreCase("female")) {System.out.println("Hey lady you retired");
		
			
		}
		else {System.out.println("No need to work");

		}
		
		
		scan.close();
		
	}

}
