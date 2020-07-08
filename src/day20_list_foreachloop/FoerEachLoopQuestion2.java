package day20_list_foreachloop;

public class FoerEachLoopQuestion2 {

	public static void main(String[] args) {
		/*
		 * Create an integer array find the sum of all elements by using for-each loop
		 * and print the sum on the console.
		 */
 int[] arr= {1,2,3};
 int sum=0;
 for (int i : arr) {
	sum+=i;
	
}System.out.println("sum:"+sum);
		
	}

}
