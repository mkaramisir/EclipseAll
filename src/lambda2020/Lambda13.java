package lambda2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lambda13 {

	public static void main(String[] args) {
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
		Collections.sort(list);
		System.out.println(list);
		//print all elements by using funcional programing on the console
		list.stream()
			.forEach(System.out::print);//method referance
		Stream.of(3, 5, 5, 7, 10, 13, 13, 14, 16).forEach(System.out::println);
	
		int[] arr= {13,21,2,34,65,1,43};
			
		Arrays.stream(arr)
	          .forEach(System.out::print);
		
		//find the minimum value of the array elements by using funtional
		System.out.println(Arrays.stream(arr).min());
		System.out.println(Arrays.stream(arr).max());
		System.out.println(Arrays.stream(arr).average());
		System.out.println(Arrays.stream(arr).sum());
		
		
		
		
		
	}

}
