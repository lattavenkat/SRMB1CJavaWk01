package com.srm.cjava.wk02.day08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class concatlist {
    public void usingaddall() {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);

        System.out.println("LIST 1: " + l1);
        System.out.println("LIST 2: " + l2);
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        l3.addAll(l1);
        l3.addAll(l2);
        System.out.println("----------------------------------------------------------");
        System.out.println("CONCATENATION OF LIST USING AddAll() METHOD, LIST 3=" + l3);
        // using iterator
        Iterator i = l1.iterator();
        while (i.hasNext()) {
            l2.add((int) i.next());
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("CONCATENATION OF LIST USING ITERATOR, MERGED LIST =" + l3);
    }

    public void usingarrlist() {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        l3.addAll(l1);
        l3.addAll(l2);
        System.out.println("LIST 1 : " + l1);
        System.out.println("LIST 2 : " + l2);
        System.out.println("----------------------------------------------------------");
        System.out.println("CONCATENATION OF LIST USING ARRAYLIST, LIST 3= : " + l3);
    }   
}

public class ConcatLinkedList {
    public static void main(String[] args) {

        concatlist ob = new concatlist();
        ob.usingaddall();
        ob.usingarrlist();

    }
}
