package day16;

public class Static01WithMainMethod {

	public static void main(String[] args) {
		//to reach static variables
		// 1) i can reach them by using just class name
		// 2) i can reach them by using object as well but it is not recommended (do not do it) 
		System.out.println(Static02WithoutMainMethod.name2);
		System.out.println(Static02WithoutMainMethod.num2);
		Static02WithoutMainMethod.method2();
		
		//to reach instance variable and method
		// you have just one way which creating object and reaching them throughout.
		Static02WithoutMainMethod obj1=new Static02WithoutMainMethod();
		System.out.println(obj1.name1);
		System.out.println(obj1.num1);
		obj1.method1();
		
			
		
	}

}
