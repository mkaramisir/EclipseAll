package day09_string_methods_for_loop;

import java.util.Scanner;

public class WarmUp9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter one of the 'U','S','A'");
		char ch=scan.next().toUpperCase().charAt(0);
	
		switch (ch) {
		case 'U':
			System.out.println("United");
			break;
		case 'S':
			System.out.println("State");
			break;
		case 'A':
			System.out.println("America");
			break;

		default:
			System.out.println("Just one of the 'U','S','A'" );
		
		}
	     }
		}


