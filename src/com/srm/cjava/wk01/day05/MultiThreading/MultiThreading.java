package com.srm.cjava.wk01.day05.MultiThreading;

public class MultiThreading {
    public static void main(String... args) {
        RandomNumber rn1 = new RandomNumber();
        rn1.start();
        RandomNumber rn2 = new RandomNumber();
        rn2.start();
        RandomNumber rn3 = new RandomNumber();
        rn3.start();
    }

}
