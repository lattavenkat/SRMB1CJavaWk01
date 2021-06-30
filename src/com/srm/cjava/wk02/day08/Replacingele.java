package com.srm.cjava.wk02.day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Replacingele {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Latha");
        arr.add("Amul");
        arr.add("Lokesh");
        arr.add("Venkat");
        arr.add("Sumathy");
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equalsIgnoreCase("LOKESH")) {
                arr.set(i, "Karthik");
            }
        }
        System.out.println("After Replacing" + arr);
        Collections.sort(arr);
        System.out.println("Sorting: " + arr);
        arr.remove(0);
        System.out.println("After Removing element at 0th position: " + arr);
        System.out.println("Checking if element 'Karthik' is present? " + arr.contains("Karthik"));
    }
}
