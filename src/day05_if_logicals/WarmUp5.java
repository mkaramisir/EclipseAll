package day05_if_logicals;

import java.util.Scanner;

public class WarmUp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of the week");
		String nameOfTheWeek = scan.next();
		char second = nameOfTheWeek.charAt(1);
		char fourth = nameOfTheWeek.charAt(3);
		char sixth = nameOfTheWeek.charAt(5);
		System.out.println(second + "" + fourth + "" + sixth);// System.out.println(""+second + fourth + sixth);
		scan.close();
	}

}
