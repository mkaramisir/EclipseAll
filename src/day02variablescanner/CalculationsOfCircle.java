package day02variablescanner;

import java.util.Scanner;

public class CalculationsOfCircle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the radius as float ");
		float radius=s.nextFloat();
		System.out.println("area of circle is "+ 3.14159*radius*radius);
		System.out.println("primeter of circle is"+ 2*3.14159*radius);
		s.close();
	}

}
