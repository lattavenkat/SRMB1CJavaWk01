package com.srm.cjava.Test;

import java.util.HashSet;
import java.util.Set;

public class Copyelements {
    public static void main(String args[]) {
        int j = 0;
        Set<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1124);
        hashSet.add(3654);
        hashSet.add(7854);
        hashSet.add(9945);
        System.out.println(hashSet);
        Integer[] array = new Integer[hashSet.size()];
        
        for (Integer i : hashSet) {
            array[j++] = i;
        }
    }
}
