package assignment01;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter hours value.");
		long hours = scan.nextLong();
		scan.close();
		System.out.println(hours + " hours = " + (hours * 60 * 60) + " second");
	}
}

