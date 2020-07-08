package day19_array_lists;

import java.util.ArrayList;
import java.util.List;

public class ClearMethod {

	public static void main(String[] args) {
		// clear() is used to delete all elements inside a list
		List<String> list1=new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Can");
		list1.clear();
		System.out.println(list1);	
	
	}

}
