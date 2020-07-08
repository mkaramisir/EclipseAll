package day_21_passby_date_accessmodifiers;

import java.util.Arrays;

public class Varargs01 {

	public static void main(String[] args) {
		/*
		 * create a method which has 3 parameters outside the main method.
		 *  make parameter as varargs.
		 *   call the method from main methos in differend argumets
		 * 
		 */
		print(1,3,5,7);
		print(1, 7);
		print(3,4,5,6,7,3,2,1,2,3);
		

	}
	public static void print(int start,int end,int...nums) {
		System.out.println(start);
		System.out.println(end);
		System.out.println(Arrays.toString(nums));
	}

}
