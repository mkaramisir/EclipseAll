package day02variablescanner;

import java.util.Scanner;

public class CalculatePrimeterOfTriangle {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		/*
		 * System.out.println("please enter 1. length as byte"); byte
		 * length1=s.nextByte();
		 * 
		 * System.out.println("please enter 2. length as byte"); byte
		 * length2=s.nextByte();
		 * 
		 * System.out.println("please enter 3. length as byte"); byte
		 * length3=s.nextByte();
		 * System.out.println("primeter of triange is "+ (length1+ length2+ length3));
		 */
		System.out.println("please enter the sides of the triangle as byte data type ");
      	byte 	side1=s.nextByte(), side2=s.nextByte(),side3=s.nextByte();
      	System.out.println("primeter of triange is "+ (side1+ side2+ side3));
	s.close();
	}

}
