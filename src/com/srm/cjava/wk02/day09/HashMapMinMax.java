package com.srm.cjava.wk02.day09;

import java.util.HashMap;
import java.util.Iterator;


public class HashMapMinMax {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(1, 10);
        hm.put(2, 45);
        hm.put(3, 100);
        hm.put(4,3);

        // int minValue=(Collections.min(hm.values()));
        // int maxKey = (Collections.max(map.keySet()));
        // for (Entry<Integer, Integer> entry : hm.entrySet()) {
        // if (entry.getValue()==minValue) {
        // // System.out.println(entry.getKey());
        // }
        // }
        // System.out.println("The Min value is: " + minValue);
        Iterator<Integer> it = hm.keySet().iterator();
        Integer x = it.next();
        Integer max = hm.get(x);
        Integer min = hm.get(x);
        while (it.hasNext()) {
            Integer k = it.next();
            Integer val = hm.get(k);
            if (val > max) {
                max = val;
                x = k;
            }
            if (val < max) {
                min = val;
                x = k;
            }
        }
        System.out.println("MAP VALUES: "+hm);
        System.out.println("The Min value is: " + min+ "is asociated with" + x+ "key");
        System.out.println("Max Value " + max + " is associated with " + x + "key");        
    }
}
