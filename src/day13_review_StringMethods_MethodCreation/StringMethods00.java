package day13_review_StringMethods_MethodCreation;

import java.util.Scanner;

public class StringMethods00 {

	public static void main(String[] args) {
		/*
		 * Task: Ask user to enter his first name. Make the first and the last letters
		 * “*”
		 */
		Scanner scan = new Scanner(System.in);
				System.out.println("enter first name");
		String str=scan.next();
		String changeFirstCharacter=str.substring(0,1).replace(str.substring(0,1), "*");
		String changeLastCharacter=str.substring(str.length()-1).replace(str.substring(str.length()-1), "*");
		System.out.println(changeFirstCharacter+str.substring(1,str.length()-1)+changeLastCharacter);
		scan.close();
	}

}
