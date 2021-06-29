package com.srm.cjava.wk01.day05.MultiThreading;

public class Cube extends Thread{
    int x;
    Cube(int n){
        x = n;
    }
    public void run(){
        int cubeval = x * x * x;
        System.out.println("Cube of " + x + " = " + cubeval);
    }
}
