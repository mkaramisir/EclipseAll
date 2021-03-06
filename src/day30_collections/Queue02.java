package day30_collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue02 {

    public static void main(String[] args) {
        // Create two Queue's by using LinkedList and Priority Queue
        LinkedList<Integer> que1 = new LinkedList<Integer>();
        que1.add(2);
        que1.add(1);
        que1.add(3);
        System.out.println(que1);//[2, 1, 3]
        
        Queue<Integer> que2 = new PriorityQueue<Integer>();
        que2.add(2);
        que2.add(1);
        que2.add(3);
        System.out.println(que2);//[1, 2, 3]
        System.out.println(que2.element());
        System.out.println(que2.peek());
        System.out.println(que2);        
        System.out.println(que2.poll());
        System.out.println(que2);        
                
        
        
        
    }
}