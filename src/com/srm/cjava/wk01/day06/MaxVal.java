package com.srm.cjava.wk01.day06;

public class MaxVal {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum of [98, 34, 54] is: " + maximum(98, 34, 54));
        System.out.println("Maximum of [5.6676, 9.543, 6.5467] is: " + maximum(5.6676, 9.543, 6.5467));
        System.out.println("Maximum of [Ram, Arunachalam, Priyu] is: " + maximum("Ram", "Arunachalam", "Priyu"));
    }
}
