package day02variablescanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter a lentgh of the square. ");
		Float lenghtOfSide = scan1.nextFloat();
		System.out.println("area of square is: " + (lenghtOfSide * lenghtOfSide) + "\n" + "Perimeter of a square is: "
				+ (4 * lenghtOfSide));
	scan1.close();}

}
