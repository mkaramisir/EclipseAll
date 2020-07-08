package Assignment6;

import java.util.ArrayList;
import java.util.List;

public class E {

	public static void main(String[] args) {
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two));    // true
		one.add("a");          // [a]
		System.out.println(one.equals(two));    // false
		two.add("a");          // [a]
		System.out.println(one.equals(two));    // true
		one.add("b");         // [a,b]
		two.add(0, "b");    // [b,a]
		System.out.println(one.equals(two));    // false
	}

}
