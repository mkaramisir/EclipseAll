package assignment02;

import java.util.Scanner;

public class Q10 {
	/*
	 * Ask user to enter the amount of his/her money, and the price of a wing. Then
	 * calculate the piece of the wing that user can buy. Remember that you cannot
	 * buy part of a wing.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter amount of your money and price of the wing.");
		float money = s.nextFloat();
		float wingPrice = s.nextFloat();
		float AmountOfWing = money / wingPrice;
		int a = (int) AmountOfWing;
		s.close();
		System.out.println(a);

	}

}
