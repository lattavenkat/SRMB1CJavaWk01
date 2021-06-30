package com.srm.cjava.wk02.day08;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreesetSum {
    private static int x = 0;
    public static int rec(Iterator<Integer> num) {
        
        while(num.hasNext()){
            x+=num.next();
            return rec(num);
        }
        return x;     
    }
    public static void main(String[] args) {
        
        int sum = 0;
        Set<Integer> tset = new TreeSet<>();
        tset.add(1);
        tset.add(3);
        tset.add(2);
        tset.add(4);
        Iterator<Integer> itr2 = tset.iterator();
        System.out.println("\nThe Sum of TreeSet using recursion: " + itr2);

        // while
        while(itr2.hasNext()){
            sum+=itr2.next();
        }
        System.out.println("Sum Of Numbers In TreeSet Using While Loop: " + sum);
        // for loop 
             
        sum=0;
        for (Integer i : tset) {
            sum += i;
        } 
        System.out.println("Numbers in TreeSet: " + tset.toString());
        System.out.println("Sum Of Numbers In TreeSet Using For Loop: " + sum);
        //recursive
        Iterator<Integer> itr1 = tset.iterator();
        System.out.println("\nThe Sum of TreeSet using recursion: " + rec(itr1));

    }
 
}
