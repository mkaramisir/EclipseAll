package day20_list_foreachloop;

public class FoerEachLoopQuestion3 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to find the common elements between two arrays (string
		 * values).
		 */
		String[] a = { "a", "b", "c" };
		String[] b = { "v", "a", "e" };
		for (String i : a) {
			for (String j : b) {
				if (i.equals(j)) {
					System.out.println(j);
				}
			}
		}

	}

}
