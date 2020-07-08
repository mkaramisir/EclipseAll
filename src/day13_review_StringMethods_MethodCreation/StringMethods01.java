package day13_review_StringMethods_MethodCreation;

public class StringMethods01 {

	public static void main(String[] args) {
		String str1 = "Hello Java i am here";
		String str2 = "";
		// startsWith() checks initial character and return boolean
		boolean resultForInitial = str1.startsWith("h");
		boolean resultForFirstWord=str1.startsWith("Hello");
		boolean resultForBeginig=str1.startsWith("Java",6);
		
		System.out.println(resultForInitial);
		System.out.println(resultForFirstWord);
		System.out.println(resultForBeginig);
		
		//endWith() checks the last characters and returns boolean
		boolean resultForLastCharacter=str1.endsWith("e");
		boolean resultForLastCharacters=str1.endsWith("here");
		System.out.println(resultForLastCharacter);
		System.out.println(resultForLastCharacters);
		//isEmpty() checks it is empty or not returns boolean result.
		boolean isEmpty=str1.isEmpty();
		boolean isEmptySecond=str2.isEmpty();
		System.out.println(isEmpty);
		System.out.println(isEmptySecond);
		
	}

}
