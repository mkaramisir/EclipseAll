package day04_memo_operations_if;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Pease enter three digits number");//reverse

		int num = s.nextInt();

		int first = num % 10, num2 = num / 10, second = num2 % 10, third = num / 100;
		System.out.println(first + "" + second + "" + third);
		s.close();
	}

}
