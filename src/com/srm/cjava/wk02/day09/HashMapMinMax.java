package com.srm.cjava.wk02.day09;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapMinMax {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(1, 10);
        hm.put(2, 45);
        hm.put(3, 100);
        hm.put(4,3);
        hm.put(7,78);

        // int minValue=(Collections.min(hm.values()));
        // int maxKey = (Collections.max(map.keySet()));
        // for (Entry<Integer, Integer> entry : hm.entrySet()) {
        // if (entry.getValue()==minValue) {
        // // System.out.println(entry.getKey());
        // }
        // }
        // System.out.println("The Min value is: " + minValue);
        Iterator<Integer> it = hm.keySet().iterator();
        Integer fk = it.next();
        Integer max = hm.get(fk);
        Integer min = hm.get(fk);
        while (it.hasNext()) {
            Integer k = it.next();
            Integer val = hm.get(k);
            if (val > max) {
                max = val;
                fk = k;
            }
            if (val < max) {
                min = val;
                fk = k;
            }
        }
        System.out.println("MAP VALUES: "+hm);
        System.out.println("The Min value is: " + min+ "is asociated with" + fk+ "key");
        System.out.println("Max Value " + max + " is associated with " + fk + "key");
        
    }
}
