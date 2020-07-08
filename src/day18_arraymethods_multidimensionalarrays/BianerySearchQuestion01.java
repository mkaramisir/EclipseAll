package day18_arraymethods_multidimensionalarrays;

import java.util.Arrays;

public class BianerySearchQuestion01 {

	public static void main(String[] args) {
	int arr[]= {3,5,6,9,5,10,6};
	Arrays.sort(arr);
	System.out.println(Arrays.binarySearch(arr,1));
	System.out.println(Arrays.binarySearch(arr,5));
	System.out.println(Arrays.binarySearch(arr,11));
	System.out.println(Arrays.binarySearch(arr,14));
	//if you have duplicate elements you will get the index of first occurance

	}

}
