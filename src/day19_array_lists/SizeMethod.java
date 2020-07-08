package day19_array_lists;

import java.util.ArrayList;
import java.util.List;

public class SizeMethod {

	public static void main(String[] args) {
		// to get the number of element in a list we use size
		List<String> list1=new ArrayList<>();
		System.out.println(list1.size());//0
		
		//Array and ArrayLists allows duplication
		list1.add("A");
		list1.add("A");
		System.out.println(list1.size());//2
		
		//How can you understand, a list has no any element.
		//list.sise()==0   there is no element
		// isEmpty() return boolean. if list no element returns true. otherwise false
		List<String> list2= new ArrayList<>();
		System.out.println(list1.isEmpty());
		System.out.println(list2.isEmpty());
		
	}

}
