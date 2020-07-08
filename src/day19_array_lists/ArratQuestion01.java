package day19_array_lists;

import java.util.Arrays;

public class ArratQuestion01 {

	public static void main(String[] args) {
		// Write a Java program to remove a specific element from an array.
		int[] arr = { 8, 5, 6, 7, };
		int[] removedArr = new int[arr.length - 1];
		int removedindex = 1;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == removedindex)
				continue;
			removedArr[j] = arr[i];
			j++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(removedArr));

	}

}
