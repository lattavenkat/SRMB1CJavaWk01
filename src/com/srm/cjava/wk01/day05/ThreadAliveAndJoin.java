package com.srm.cjava.wk01.day05;

public class ThreadAliveAndJoin {
    public static void main(String args[]) {
        ThreadImpl t1 = new ThreadImpl("One");
        ThreadImpl t2 = new ThreadImpl("Two");
        ThreadImpl t3 = new ThreadImpl("Three");
        System.out.println("Thread One is alive: " + t1.t.isAlive());
        System.out.println("Thread Two is alive: " + t2.t.isAlive());
        System.out.println("Thread Three is alive: " + t3.t.isAlive());
        try {
            System.out.println("Waiting for threads to finish.");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Thread One is alive: " + t1.t.isAlive());
        System.out.println("Thread Two is alive: " + t2.t.isAlive());
        System.out.println("Thread Three is alive: " + t3.t.isAlive());
        System.out.println("Main thread exiting.");
    }
}
