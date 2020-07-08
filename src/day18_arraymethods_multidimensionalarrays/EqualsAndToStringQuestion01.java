package day18_arraymethods_multidimensionalarrays;

import java.util.Arrays;

public class EqualsAndToStringQuestion01 {

	public static void main(String[] args) {
		/*
		 * Create two arrays which have same elements in different order. Use equals()
		 * to compare them before using sort() and after using sort() Print the elements
		 * of the arrays on the console by using toString() (edited)
		 */
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 2, 1, 3 };
		System.out.println(Arrays.equals(arr1, arr2));
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}

}
