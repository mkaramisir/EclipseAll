package day29_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethod2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		ListIterator<String> litr=list.listIterator();
		litr.add("D");
		litr.add("E");
		litr.previous();
		litr.previous();
	
		System.out.println(list);
		
		
		while(litr.hasNext()) {
			Object element=litr.next();
			litr.set(element+"W");
		}
		System.out.println(list);
		
		
		
		
		
	}

}
