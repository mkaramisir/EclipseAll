package day18_arraymethods_multidimensionalarrays;

import java.util.Arrays;

public class SplitQuestion01 {

	public static void main(String[] args) {
	String str="I like Java, did you like it.";
	String arr[]=str.split("d");//d will be like a checkpoint. we will not see d on the console
	String arr2[]=str.split(" ");
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(arr2));
	}

}
