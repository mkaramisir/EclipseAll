package day13_review_StringMethods_MethodCreation;

public class MethodCreation4 {

	public static void main(String[] args) {
		/*
		 * Create a method outside of the main method Get(Pass) first name and last name
		 * as a parameter into the method If just the initials are uppercase, print on
		 * the console “Good job” Call the method from inside the main method by using
		 * arguments
		 */
		getStringVAlue("Sibel", "Cirak");

	}

	public static void getStringVAlue(String firstName, String lastName) {
		if ((firstName.charAt(0) >= 'A' && firstName.charAt(0) <= 'Z')
				&& (lastName.charAt(0) >= 'A' && lastName.charAt(0) <= 'Z')) {
			System.out.println("Good job");
		} else {
			System.out.println("your first and last name initials are not uppercase");
		}
	}

}
