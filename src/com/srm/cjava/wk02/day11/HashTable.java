package com.srm.cjava.wk02.day11;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> m = new Hashtable<>();
        m.put(100, "A");
        m.put(200, "B");
        m.put(300, "C");
        m.put(400, "D");
        m.put(500, "E");
        System.out.println("Hastable Values : " + m);
        System.out.println("Hashcode of the Hashtable is" + m.hashCode());
        System.out.println("Size of Hashtable is " + m.size());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value to search in hash table");
        String s=sc.next();
        if (m.containsValue(s)) {
             System.out.println("Key "  +s+ " is found!");
        }
        else{
            System.out.println("Element "+s+ " not found in hastable");
        }
        m.remove(500);
        System.out.println("After Removing hash key 500: "+m);
        sc.close();
    }
}
