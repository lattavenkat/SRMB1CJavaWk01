package com.srm.cjava.wk02.day12;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class IteratingHashTab {
    public static void main(String[] args) {
        Hashtable<String, Double> ht = new Hashtable<String, Double>();

        String name;
        double salary;

        ht.put("Swathi", 24000.34);
        ht.put("Pooja", 35987.22);
        ht.put("Harini", 67878.00);
        ht.put("Kaviya", 19000.22);
        ht.put("Reshma", 29000.08);

        Set<String> set = ht.keySet();
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            name = itr.next();
            System.out.println(name + ": " + ht.get(name));
        }
        System.out.println();
        salary = ht.get("Kaviya");
        ht.put("Kaviya", salary + 1000.00);
        System.out.println("Kaviya's new Salary: " + ht.get("Kaviya"));

    }
}
