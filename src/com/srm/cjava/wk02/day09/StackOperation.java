package com.srm.cjava.wk02.day09;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> aq = new ArrayDeque<Integer>();
        System.out.println("Enter Elements: ");
        for (int i = 0; i <= 5; i++) {
            int ele = sc.nextInt();
            aq.add(ele);
        }
        System.out.println("Popping an element: " + aq.pop());
        System.out.println("Enter element to add in the beginning: ");
        aq.addFirst(1010);
        System.out.println("Adding 1010 element at the beginning ");
        System.out.println("Enter element to search: ");
        int s = sc.nextInt();
        System.out.println("Check if element found? "+aq.contains(s));
        System.out.println("Sorting in decending order"+aq.descendingIterator());
        System.out.println("checking whether list is empty? "+aq.isEmpty());
    }
}
