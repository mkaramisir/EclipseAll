package day02variablescanner;

import java.util.Scanner;

public class CalculateOfVolumeOfRectangularPrisim {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter width ");
		double width = s.nextDouble();

		System.out.println("please enter length ");
		double length = s.nextDouble();

		System.out.println("please enter height ");
		double height = s.nextDouble();
		System.out.println("volume of a rectangular prism is " + (width * length * height));
s.close();
	}
}
