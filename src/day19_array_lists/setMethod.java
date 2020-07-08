package day19_array_lists;

import java.util.ArrayList;
import java.util.List;

public class setMethod {

	public static void main(String[] args) {
		// set() is used to change an ellement
		List<String> list1=new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Can");
		System.out.println(list1);
		//change Ali to Jhon;
		
		list1.set(0, "John");
		System.out.println(list1.set(0, "John"));
		System.out.println(list1);
		//don't use set() to add something to the list
		//out of bound exception   ==>  System.out.println(list1.set(3, "George"));
		
		
	}

}
