package day18_arraymethods_multidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
	int arr[][]= {{1,2},{3},{4,5,6}};
	
	System.out.println(Arrays.toString(arr[0]));
	System.out.println(Arrays.toString(arr[1]));
	System.out.println();
	//print m.d array with deepToString
	System.out.println(Arrays.deepToString(arr));
	System.out.println(arr[2][1]);
	System.out.println(arr[0][0]);
	System.out.println(arr[1][0]);
	System.out.println(arr[2][2]);
	}

}
