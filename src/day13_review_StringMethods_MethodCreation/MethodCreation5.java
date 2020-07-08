package day13_review_StringMethods_MethodCreation;

public class MethodCreation5 {

	public static void main(String[] args) {
		/*
		 * Create a method with parameters outside of the main method Method should
		 * return “Retired” if the gender is male and the age is more than 65, should
		 * return “Retired” if the gender is female and the age is more than 60.
		 * Otherwise, should return “Not retired” Call the method from inside main
		 * method with arguments and print the result on the console
		 */

		learnRetiredOrNot("female", 31);
	}

	public static void learnRetiredOrNot(String gender, int age) {
		if (gender.equalsIgnoreCase("male") && age > 65) {
			System.out.println("Retired");
		} else if (gender.equalsIgnoreCase("female") && age > 60) {
			System.out.println("retired");
		} else {
			System.out.println("not retired");
		}
	}

}
