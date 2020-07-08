package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

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
		System.out.println(list);
		// use structure code
		for (Integer i : list) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
		}

		list.stream().filter(t -> t % 2 == 0).forEach(System.out::print);

		System.out.println();

		list.stream().filter(n -> n % 3 == 0).forEach(System.out::print);
	}

}
