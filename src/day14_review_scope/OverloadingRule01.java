package day14_review_scope;

public class OverloadingRule01 {

	public static void main(String[] args) {
		
	      /*
        1) Number of parameters.
               add(int)
               add(int, int)
               add(int, int, int)
        */
       
       overload01(3);
       overload01(3,4);
   }
   
   public static void overload01(int num1) {
       System.out.println("If the number of parameters are different, overloading is okay");
   }
   
   public static void overload01(int num1, int num2) {
       System.out.println("If the number of parameters are different, overloading is okay");
	}
}
