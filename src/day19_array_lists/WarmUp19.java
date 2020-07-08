package day19_array_lists;

import java.util.Scanner;

public class WarmUp19 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter long two sentences. Then type a program to count all
		 * “words” in the sentences. For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14. Hint: Use
		 * split()
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two long senteces");
		String str=scan.nextLine();
		String[] arr= str.split(" ");
		System.out.println(arr.length);
	
		
	}

}
