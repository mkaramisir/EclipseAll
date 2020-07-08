package assignment03;

import java.util.Scanner;

public class Question4 {
	//Ask user to enter 2 chars in uppercase. Print them on the console in alphabetical order

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two uppercase chars");
		char ch1=scan.next().charAt(0);
		char ch2=scan.next().charAt(0);
		scan.close();
		if (ch1>ch2) {
			System.out.println(""+ch2+ch1);
		} else {
		System.out.println(""+ch1+ch2);
		}
		
	}

}
