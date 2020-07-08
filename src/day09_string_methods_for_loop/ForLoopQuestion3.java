package day09_string_methods_for_loop;

public class ForLoopQuestion3 {

	public static void main(String[] args) {
		/*
		 * Print all even integers on the console from 2 to 200 in the same line with
		 * comma and space between them. Like 2, 4, 6, 8, . . . 196, 198, 200
		 */

		for (int i = 2; i <= 200; i += 2) {
			System.out.print(i + ",");
		}
	}
}
