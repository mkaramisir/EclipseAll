package day30_collections;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet01 {

	 public static void main(String[] args) {
	        // To create a linkedHashSet
	        LinkedHashSet<String> lhSet = new LinkedHashSet<String>();
	        
	        //To add elements
	        lhSet.add("C");
	        lhSet.add("A");
	        lhSet.add("D");
	        lhSet.add("B");
	        System.out.println(lhSet);//[C, A, D, B]
	        
	        //Convert lhSet to TreeSet to put the elements in natural order
	        TreeSet<String> trSet = new TreeSet<String>(lhSet);
	        System.out.println(trSet);//[A, B, C, D]
	        
	        //To get the size
	        System.out.println(lhSet.size());
	        
	        //To remove an element 
	        lhSet.remove("C");
	        System.out.println(lhSet);//[A, D, B]
	        lhSet.remove("D");
	        System.out.println(lhSet);//[A, B]
	        
	        //To get HashCode.hashCode() is returning the sum of the hashCodes of all elements
	        System.out.println(lhSet.hashCode());
	        
	        //To remove all elements
	        System.out.println(lhSet.removeAll(lhSet));//true
	        System.out.println(lhSet);//[] 
	    }
	}
