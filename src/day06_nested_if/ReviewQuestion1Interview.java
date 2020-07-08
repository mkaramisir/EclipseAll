package day06_nested_if;

import java.util.Scanner;

public class ReviewQuestion1Interview {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a word which has 4 letters and output will be inverse of
		 * the word. For example; if user enters “MARK” output will be “KRAM”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a word which has 4 letters");
		String word = scan.next();
	
		//if i call charter in the string while concatanation i dont need to use "" between ++.
		
		//System.out.println("reversed word is " + word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + "" + word.charAt(0));
		System.out.println("reversed word is " + word.charAt(3)  + word.charAt(2)+ word.charAt(1)+ word.charAt(0));
		scan.close();
	}

}
