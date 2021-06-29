package com.srm.cjava.wk02.day08;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class sumofnum {
    private static int x = 0;
    public void meth1() {
        Set<Integer> t = new TreeSet<>();
        t.add(1);
        t.add(3);
        t.add(2);
        t.add(4);
        int sum = 0;

        Iterator<Integer> itr = t.iterator();
        // while
        while(itr.hasNext()){
            sum+=itr.next();
        }

        System.out.println("Sum Of Numbers In TreeSet Using While Loop: " + sum);
        // for loop
        for (Integer i : t) {
            sum += i;
        }
        sum=10;
        System.out.println("Numbers in TreeSet: " + t.toString());
        System.out.println("Sum Of Numbers In TreeSet Using For Loop: " + sum);
    }
    public static int rec(Iterator<Integer> inum) {
        
        while(inum.hasNext()){
            x+=inum.next();
            return rec(inum);
        }
        return x;
    }
}
public class TreesetSum {
    public static void main(String[] args) {
        
        sumofnum ob = new sumofnum();
        Iterator<Integer> itr2 = sum.iterator();
        System.out.println("\nThe Sum of TreeSet using recursion: " + sum(itr2));
        ob.meth1();
    }
}
