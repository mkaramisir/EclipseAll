package lambda2020;

import java.security.acl.LastOwnerException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.RowFilter.ComparisonType;

public class Lambda08 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Chris");
		list.add("Tucker");

		// Print the elements in natural order
		list.stream().sorted(Comparator.naturalOrder()).map(t -> t + " ").forEach(System.out::print);

		System.out.println();
		// Print the elements in reverse order
		list.stream().sorted(Comparator.reverseOrder()).map(t -> t + " ").forEach(System.out::print);

		System.out.println();
		// Print the elements on the console according to the length of the elements
		list.stream().sorted(Comparator.comparing(t -> t.length())).map(t -> t + " ").forEach(System.out::print);

		System.out.println();
		// Print the elements on the console according to the last letter of the
		// elements
		list.stream().sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).map(t -> t + " ")
				.forEach(System.out::print);

		System.out.println();

		// print the element on the console in reverse order as a list
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		//collect method is used to collect elements inside a collection
		System.out.println();
		
		
		
		
		
	}
}
