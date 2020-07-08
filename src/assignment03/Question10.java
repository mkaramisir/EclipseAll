package assignment03;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		//Ask user to enter three chars. Print them on the console in alphabetical order
	   Scanner scan = new Scanner(System.in);
	    System.out.println("Enter 3 char values.");
	    char ch1=scan.next().charAt(0);
	    char ch2=scan.next().charAt(0);
	    char ch3=scan.next().charAt(0);
	    scan.close();
	    if (ch1 < ch2 && ch2 < ch3) {
			System.out.println(ch1 + " " + ch2 + " " + ch3);
		}
	    else if (ch1 < ch2 && ch2 > ch3 && ch1 < ch3) {
			System.out.println(ch1 + " " + ch3 + " " + ch2);
		}
		if (ch2 < ch1 && ch1 < ch3) {
			System.out.println(ch2 + " " + ch1 + " " + ch3);
		}
		else if (ch2 < ch1 && ch1 > ch3 && ch2 < ch3) {
			System.out.println(ch2 + " " + ch3 + " " + ch1);
		}
		if (ch3 < ch1 && ch1 < ch2) {
			System.out.println(ch3 + " " + ch1 + " " + ch2);
		}
		else if (ch3 < ch1 && ch1 > ch2 && ch3 < ch2) {
			System.out.println(ch3 + " " + ch2 + " " + ch1);
		}else {System.out.println(""+ch1+ch2+ch3);}

	}

}
