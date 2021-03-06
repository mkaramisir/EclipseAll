package day30_collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTable02 {


    public static void main(String[] args) {
        //Create a HashTable
        Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
        
        //Add elements
        hashTable.put(2, "X");
        hashTable.put(50, "M");
        hashTable.put(91, "Y");
        hashTable.put(7, "V");
        System.out.println(hashTable);
        
        Iterator itr = hashTable.entrySet().iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        //Enumeration is an interface
        //Enumeration interface does not have remove() method.
        //Enumeration has hasMoreElements() and nextElement()
        
        Enumeration name = hashTable.keys();
        while(name.hasMoreElements()) {
            int key = (int) name.nextElement();
            System.out.println(key);//I got the keys
            System.out.println(hashTable.get(key));// I got the values
        }
    }
}

