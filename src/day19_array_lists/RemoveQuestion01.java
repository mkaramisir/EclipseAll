package day19_array_lists;

import java.util.ArrayList;
import java.util.List;

public class RemoveQuestion01 {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Can");
		
		System.out.println(list1.remove(0));
		System.out.println(list1);
		System.out.println(list1.remove(0));
		System.out.println(list1);
		
		
	}

}
