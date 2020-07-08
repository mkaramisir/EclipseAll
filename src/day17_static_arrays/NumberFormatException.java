package day17_static_arrays;

public class NumberFormatException {

	public static void main(String[] args) {

		int num = Integer.parseInt("Ali");
		// If you put a String which cannot be converted to integer
		// you will get "NumberFormatException" on the console.
		// If the String is convertible to an integer, you get the output.
		System.out.println(num);

	}

}
