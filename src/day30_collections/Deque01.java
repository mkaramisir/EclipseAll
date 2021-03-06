package day30_collections;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Deque01 {
	public static void main(String[] args) {
        // Deque is an interface
        // Deque = Double Ended Queue, Deque can use FIFO and LIFO(Last In First Out)
        
        //Create a Deque
        Deque<String> deque = new LinkedList<String>(); 
        //Add the elements
        deque.add("B");
        deque.add("A");
        deque.add("D");
        deque.add("C");
        System.out.println(deque);//[B, A, D, C]
        
        //push() adds the element at the head of the deque
        //addFirst() does the same
        deque.push("X");
        System.out.println(deque);//[X, B, A, D, C]
        
        //offer() adds the element at the tail of the deque
        //addLast() does the same
        deque.offer("Z");
        System.out.println(deque);//[X, B, A, D, C, Z]
        //pop() returns the head and removes it
        System.out.println(deque.pop()); // X
        System.out.println(deque);//[B, A, D, C, Z]
        
        Iterator<String> itr1 = deque.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        // To reverse a deque, use descendingIterator()
        Iterator<String> itr2 = deque.descendingIterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}