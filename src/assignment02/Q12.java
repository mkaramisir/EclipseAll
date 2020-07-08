package assignment02;

import java.util.Scanner;

/*Ask user to enter a 4 digit number, then type a program to print on the console its
inverse. Like if user enters 1234, you should see on the console 4321*/
public class Q12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter 4 digit number.");
		int num = s.nextInt();
		int f = num % 10, num2 = num / 10, se = num2 % 10, num3 = num / 100, t = num3 % 10, fr = num / 1000;
		s.close();
		System.out.println(f + "" + se + "" + t + "" + fr);

	}

}
