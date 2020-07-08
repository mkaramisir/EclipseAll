package lambda2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda07 {

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
        
        //Sort the elements in natural order by using Functional Programming
        list.stream()
            .sorted() // To sort list elements use sorted()
            .forEach(System.out::println);
        
        list.stream()
            .sorted(Comparator.naturalOrder())// To sort list elements use sorted()
            .forEach(System.out::println);
        
        System.out.println("====");
        //Sort the elements in reverse order by using Functional Programming
        list.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);
        
        System.out.println("====");
        //Print the distinct elements by using Functional Programming
        list.stream()
            .distinct()
            .forEach(System.out::println);
        
        System.out.println("====");
        //Print the distinct elements in reverse order by using Functional Programming
        list.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);  
    }
}
