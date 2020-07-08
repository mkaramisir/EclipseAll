package day11_review_while_loop;

public class WhileLoopQuestion2 {

	public static void main(String[] args) {
		/*
		 * Type java code by using while loop. Write a program that types first 30
		 * consecutive odd integers.
		 */
		int num=1;
		while (num<=60) {
			System.out.println(num);
			num+=2;
			/*
			 * int i = 1; while(i<=30) { System.out.print((2*i-1) + " "); // 2xi-1 gives you
			 * odd integers everytime i++; }
			 */
		}
	}

}
