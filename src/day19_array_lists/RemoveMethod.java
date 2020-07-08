package day19_array_lists;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethod {

	public static void main(String[] args) {
		// remove() method  removes the elements from the list
		// we have 2 types of remove method 
		//1- remove() without index ==> boolean
		//2- remove() with index ==> returns removed element
		List<String> list1=new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("CAn");
		System.out.println("before removing"+list1);
		System.out.println(list1.remove("Veli"));// true, because "Veli" is inside the list
		System.out.println(list1.remove("Ayse"));// false, because "Ayse" is not inside the list
		System.out.println("after removing"+list1);//[Ali, Can]
		//to remove Ali use its index which is 0
		System.out.println(list1.remove(0));
		System.out.println(list1);
		
		
	}

}
