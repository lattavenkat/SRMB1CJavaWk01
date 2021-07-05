package com.srm.cjava.wk02.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveEvenEle {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array list elements: ");
            alist.add(sc.next());
        }

        Iterator<String> iterate = alist.iterator();
        while (iterate.hasNext()) {
            if (iterate.next().length() % 2 == 0) {
                iterate.remove();
            }
        }
        System.out.println("Array elements with even length are successfully removed from the list");
        System.out.println("Array Elements with Odd length : " + alist);

    }
}
