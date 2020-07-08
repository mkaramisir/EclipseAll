package day10_for_loop_practice;

public class ForLoopQuestion00 {

	public static void main(String[] args) {
		// Q1
		for (int i = 0; i < 5; i++) {
			System.out.println("Hell01");
			break;
		}
		// Q2
		for (int i = 0; i < 5; i++) {
			System.out.println("Hell02");
			i++;

		} // q3
		for (int i = 0; i < 5; i++) {
			System.out.println("Hell03");
			i++;
			i--;
		}
		// q4
		for (int i = 0; i < 5; i++) {
			System.out.println("Hell04");
			i += 2;
		}
		/*
		 * // Q5 for (int i = 0; i < 5;) { System.out.println("Hell05"); }
		 */

		// q6
		for (int i = 0; i > 5;) {
			System.out.println("Hell06");
		}

		// q7
		for (int i = 0; i < 5; i = 5) {
			System.out.println("Hell07");
		}
		// q8
		for (int i = 0; i < 5; i--) {
			System.out.println("Hell08");
			
		}

	}

}
