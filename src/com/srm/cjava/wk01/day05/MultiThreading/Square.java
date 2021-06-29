package com.srm.cjava.wk01.day05.MultiThreading;

public class Square extends Thread {
    int x;
    Square(int n) {
        x = n;
    }
    public void run() {
        int sqr = x * x;
        System.out.println("Square of " + x + " = " + sqr);
    }
}
