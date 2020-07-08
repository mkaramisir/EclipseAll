package day17_static_arrays;

public class ArrayQuestion7 {

	public static void main(String[] args) {
		// Find duplicate elements in a given array
		//interview
		int arr[] = { 1, 2, 3, 3, 4, 1, 5 };
		System.out.print("Duplicate numbers: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
}
