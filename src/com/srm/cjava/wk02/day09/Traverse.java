package com.srm.cjava.wk02.day09;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Traverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> mylist = new LinkedList<>();

        System.out.println("Enter number of elements to add: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            mylist.add(x);
        }
        System.out.println(mylist);

        ListIterator<Integer> li = mylist.listIterator();
        
        System.out.println("NEXT ELEMENT: " + li.next());
        System.out.println("Enter element to replace");
        int r=sc.nextInt();
        li.set(r);
        System.out.println("REPLACING AN ELEMENT " +mylist);
        System.out.println("Enter element to insert:");
        int add=sc.nextInt();
        li.set(add);
        System.out.println("AFTER ADDING AN ELEMENT " +mylist);
        System.out.println("INDEX OF NEXT ELEMENT " + li.nextIndex());
        System.out.println("PREVIOUS ELEMENT "+li.previousIndex());
        System.out.println("HAS PREVIOUS? "+li.hasPrevious());
        System.out.println("INDEX OF PREVIOUS ELEMENT "+li.previousIndex());    
        System.out.println("Enter element to remove");
        Integer re=sc.nextInt();        
        mylist.remove(re);
         System.out.println("REMOVE AN ELEMENT "+mylist);
         sc.close();
    }
}
