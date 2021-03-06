package day14_review_scope;

public class MethodCreation01 {

	public static void main(String[] args) {
		/*
		 * TASK:
		 * Create a method outside of the main method
		 * Get(Pass) the value and the unit which will be converted as a parameter into the method
		 * Your program should be able to convert hours to sec, miles to km, and kg to gr.
		 * Your program should return double and print the result on the console
		 * Call the method from inside the main method by using arguments
		 * For example; converter(20, �sec�) --> output will be 20*60*60 = 72000
		 *        converter(20, �km�) --> output will be 20*1.6 = 32
		 *        converter(20, �gr�) --> output will be 20*1000 = 20000
		 */
		
		converter(20,"km");
		converter(20,"sec");
		converter(20,"gr");

	}
	
	public static void converter(double db, String str ) {
		switch (str) {
		case "sec":
			System.out.println(db +" hour is ==> "+db*60*60+ " sec");
			break;
		case "km":
			System.out.println(db+ " miles is ==> "+db*1.6+ " km");
			break;
		case "gr":
			System.out.println(db+" kg is ==> "+db*1000+" gr");
			break;
			default:
				System.out.println("check the unit");
		
		}
	}
}
