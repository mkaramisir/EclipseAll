package day09_string_methods_for_loop;

public class ConcatAndTrimMethods {

	public static void main(String[] args) {
		/*
		 * The concat() method can be used instead of the plus operator between two
		 * Strings.
		 */

		String str1 = "Earn" + " " + "Money";
		String str2 = "Earn".concat(" ").concat("Money");

		System.out.println(str1);
		System.out.println(str2);

		/*
		 * The trim() method removes whitespace from both sides (beginning and end) of a
		 * string
		 */
		String str3 = "    Learn Java";
		System.out.println(str3);
		System.out.println(str3.trim());

		String str4 = "Learn Java      ";
		System.out.println(str4);
		System.out.println(str4.trim());

		String str5 = "   Learn Java      ";
		System.out.println(str5);
		System.out.println(str5.trim());// jus trim beginin and ending spaces.
		System.out.println(str5.replaceAll(" ", ""));
	}

}
