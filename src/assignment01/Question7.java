package assignment01;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Hello! please enter mile value");
		double mile = scan1.nextDouble();
		scan1.close();
		System.out.println(mile + " mile = " + (mile * 1.6) + " km");
	}
}
