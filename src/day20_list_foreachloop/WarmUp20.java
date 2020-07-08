package day20_list_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class WarmUp20 {

	public static void main(String[] args) {
	/*	1)Create a String list whose elements are A, C, E, and F. Print it on the console.
2)By using add() with index method, add B into the 1st index. 
     List elements should be like A, B, C, E, and F. Print it on the console.
3)By using set() method, convert E to D. 
     List elements should be like A, B, C, D, and F. Print it on the console.
4)By using remove() method, remove F from the list. 
     List elements should be like A, B, C, D. Print it on the console
5)Find the size of the list and print the size on the console.*String [] arr= {};
		*/
			
		List<String> arr=new ArrayList<>();
			arr.add("A");
		    arr.add("C");
			arr.add("E");
			arr.add("F");
			
			System.out.println(arr);
		arr.add(1, "B");
		arr.set(3," D");
		arr.remove(4);
		System.out.println(arr);
		System.out.println(arr.size());
	}

}
