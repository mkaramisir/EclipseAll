package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

	public static void main(String[] args) {
		// lambda is created for Functional Programing ===> what to do
		// the codes we typed until now are called Structural Programing===> how to do
		List<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(10);
		list.add(14);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(5);
		list.add(13);
		list.add(16);
		System.out.println(list);
		// structural code
		for (Integer w : list) {
			System.out.println(w + " ");
		}

		// Functional code type 1 ==> lambda expresion
		list.stream()                                // 13,10,14,5,7,3,5,13,16===>13
				.forEach(t -> System.out.println(t));                            // 10
													                           // 14
													                           // ...
			functionalCode02(list);
			System.out.println("=======");
			functionalCode03(list);
		
	}
	
	// Functional code type 2===> method reference--> i created a method an use it.
	public static void print(int num) {
		System.out.print(num+ " - ");
	}
	public static void functionalCode02(List<Integer> list) {
		list.stream()
		.forEach(Lambda01::print);//method reference=> classname::methodname
		
	}
	
	//Functional code 3==> method refernce --> i will use the method java created and use it
	public static void functionalCode03(List<Integer> list) {
		list.stream()
		.forEach(System.out::print);//System.out-> class and print -> method name
		
	}
	
	
	
	
}