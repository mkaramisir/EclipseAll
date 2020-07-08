package day19_array_lists;

import java.util.ArrayList;
import java.util.List;

public class AddAndSizeMethods {

	public static void main(String[] args) {
		// how to add elements into a list
		List<String> list1 = new ArrayList<>();
		System.out.println(list1);
		list1.add("Ali");
		System.out.println(list1);
		list1.add("Ayse");
		System.out.println(list1);
		list1.add("Ahmet");
		System.out.println(list1);
		//add() methods with index
		list1.add(1,"John");
		System.out.println(list1);
		//if you use the index more than the length of existinglist, you will get index out of bound exception
		
	}
}
