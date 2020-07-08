package day02variablescanner;

import java.util.Scanner;

public class CalculaterRectangle {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("please enter length value as an integer ");
		int lenght = a.nextInt();
		System.out.println("please enter width value as an integer ");
		int width = a.nextInt();
		System.out.println("primeter of rectang is " + 2 * (width + lenght));
		System.out.println("area of the rectangle is " + width * lenght);
	a.close();
	}

}
