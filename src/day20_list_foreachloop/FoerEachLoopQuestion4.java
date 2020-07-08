package day20_list_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FoerEachLoopQuestion4 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(2);
		l.add(2);
		l.add(3);
		int product=1;
		for (Integer w : l) {
			product*=w;
		}System.out.println("product="+product);
	}

}
