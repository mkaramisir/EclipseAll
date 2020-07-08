package day29_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethod01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);

		ListIterator<String> litr = list.listIterator();
		// Printing all elements on the console by using list iteretor
		while (litr.hasNext()) {
			Object element = litr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		while (litr.hasPrevious()) {
			Object element = litr.previous();
			System.out.print(element + " ");

		}
		
		while (litr.hasNext()) {
			litr.next();
			litr.remove();
		}
		System.out.println(list);
	}

}
