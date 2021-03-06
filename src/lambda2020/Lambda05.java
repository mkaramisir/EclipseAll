package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class Lambda05 {

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
        
        System.out.println(sumOfElements(list)); //86
        
        //Find the sum of all elements by using Type 3
        System.out.println(list.stream().reduce(0,Integer::sum)); //86
        
        //Find the sum of all elements by using Type 1
        System.out.println(list.stream().reduce(0, (a,b)-> a+b)); //86
        
        //Find the multiplication of the elements less than 11. Use Type 2
        System.out.println(list.stream().filter(t->t<11).reduce(1,Lambda05::multiplication));//5250
        
        //Find the multiplication of the elements less than 11. Use Type 3
        System.out.println(list.stream().filter(t->t<11).reduce(1,Math::multiplyExact));//5250
        
        //Find the multiplication of the elements less than 11. Use Type 1
        System.out.println(list.stream().filter(t->t<11).reduce(1,(a,b)->a*b));//5250
    }
    
    //Use Functional Code 
    //Find the sum of all elements by using Type 2
    public static int sum(int a, int b) {
        return a+b;
    }
    
    public static int sumOfElements(List<Integer> list) {
        return list.stream()
                   .reduce(0, Lambda05::sum); // You will get a number which is sum of all elements
    }
    
    public static int multiplication(int a, int b) {
        return a*b;
    }

}