package Assignment6;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		//1) Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
		int[][] arr={ {1,2,3}, {4,5,6} };
		int sum=0;
		for (int i = 0; i < 3; i++) {
		sum+=arr[0][i]+arr[1][i];
		}System.out.println(sum);
	}

}
