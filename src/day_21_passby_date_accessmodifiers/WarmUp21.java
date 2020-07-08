package day_21_passby_date_accessmodifiers;

import java.util.ArrayList;
import java.util.List;

public class WarmUp21 {

	public static void main(String[] args) {
		List <Integer> a=new ArrayList<>();
		List <Integer> b=new ArrayList<>();
		a.add(1);
		a.add(2);
		b.add(2);
		b.add(13);
		a.addAll(b);
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	
	
}
