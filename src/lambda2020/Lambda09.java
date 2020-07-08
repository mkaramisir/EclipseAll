package lambda2020;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import day18_arraymethods_multidimensionalarrays.BianerySearchQuestion01;

public class Lambda09 {

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
        //Predicate, Function, Consumer, BinaryOperator are Functional Interfaces
        
        //Predicate<Integer>: If a method return "boolean" then it is called "Predicate"
        //Integer is an input
        //filter(t->t%2==0) ==> t%2==0 returns true or false; so filter() is a Predicate
        
        //Function<Integer, Long>: If a method return a value then it is called Function
        //Integer is representing input, Long is representing output
        //map(t->t*t) ==> t*t is a number, number is a value different from boolean, so map() is a function
        
        //Consumer<String>: If the return of a method is "void" then it is called "Consumer"
        //String is representing input
        //forEach(System.out::print) ==> print is just printing the elements on the console, not returning anything
        //therefore, it is called Consumer
        
        //Create variables form Predicate, Function, and Consumer and use them in Functional Programming
        Predicate<Integer> isEven = t->t%2==0;
        Function<Integer, String> findSquare = t->t*t + " ";
        Consumer<String> print = System.out::print;
        
        list.stream()
            .filter(isEven)
            .map(findSquare)
            .forEach(print);
        
        //BinaryOperator<Integer, Integer, Long>:If a method uses two inputs (Integer, Integer) and 
        //returns just one output (Long) then it is called BinaryOperator.
        //reduce(0, (a,b)->a+b) is a binary operator, because a and b are inputs, a+b is output
        
        //Create variable by using BinaryOperator the use it in Functional Programming
        BinaryOperator<Integer> sum = (a,b)->a+b;
        
        System.out.println(list.stream()
                               .reduce(sum)); //86
        
        //Create a method which filters the elements and print them on the console for every filter
        Predicate<Integer> isOdd = t -> t%2!=0;
        Predicate<Integer> isDivisibleBy4 = t -> t%4==0;
        filterAndPrint(list, isEven);//10 14 16
        System.out.println("====");
        filterAndPrint(list, isOdd); // 13 5 7 3 5 13
        System.out.println("====");
        filterAndPrint(list, isDivisibleBy4); // 16
    }
    
    public static void filterAndPrint(List<Integer> list, Predicate<Integer> predicate) {
        list.stream()
            .filter(predicate)
            .forEach(System.out::print);
    }
}
