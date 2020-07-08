package assignment02;

public class Q9 {
	/*
	 * int numA = 4; int numB = 7; String str1 = “Java” String str2 = “Data” Type a
	 * program to see “Data-3 Java11” as output on the console by using
	 * “concatenation” operation.
	 */
	public static void main(String[] args) {
		int numA = 4;
		int numB = 7;
		String str1 = "Java";

		String str2 = "Data";
		System.out.println(str2 + (numA - numB) + " " + str1 + (numA + numB));

	}

}
