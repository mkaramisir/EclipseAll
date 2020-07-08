package assignment03;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter the money he has, and the price of a shirt. If the money is
		 * more than $300 then check the price of the shirt If the price is less than
		 * $200, out put will be “I can buy the shirt.” If the money is $190 then check
		 * the price of the shirt if the price is $200, out put will be “I cannot buy
		 * the shirt.” Otherwise, output will be “Let me think.”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount of money you have.");
		float amountOfPersonMoney = scan.nextFloat();
		System.out.println(" Enter the shirt price.");
		float shirtPrice = scan.nextFloat();
		scan.close();
		if (amountOfPersonMoney > 300) {
			if (shirtPrice < 200) {
				System.out.println("I can buy the shirt.");
			} else {
				System.out.println("Let me think");
			}
		} else if (amountOfPersonMoney < 190) {
			if (shirtPrice == 200) {
				System.out.println("I can not buy the shirt.");
			} else {
				System.out.println("Let me think");
			}
		}

		else {
			System.out.println("Let me think");
		}
	}

}
