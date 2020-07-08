package day13_review_StringMethods_MethodCreation;

public class StringMethods03 {

	public static void main(String[] args) {
		// isDigit()
		//isAlphabetic()
		boolean result=Character.isDigit('1');
		boolean result2=Character.isDigit('A');
		System.out.println(result);
		System.out.println(result2);
		boolean result3=Character.isAlphabetic('A');
		boolean result4=Character.isAlphabetic(' ');
		System.out.println(result3);
		System.out.println(result4);
		

	}

}
