package day14_review_scope;

public class NotOverloading {

	public static void main(String[] args) {
		/*
		 * 1) without using overloading methods, you cannot use the same method name 
		 * 2)if you get any error message while you type a code, it is name in java is
		 * compile time error
		 * 3) if you change just return type, it doesn't mean
		 * overloading. however you can change return type while you overload it is not
		 * problem.
		 */

	}

	public static void notOverloading(int num) {

	}

	public static int notOverloading(int num,int num2) {
		return num+num2;
}
}
