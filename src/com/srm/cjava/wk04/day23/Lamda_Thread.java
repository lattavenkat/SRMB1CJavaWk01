package com.srm.cjava.wk04.day23;

public class Lamda_Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": RunnableTest");
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        };
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running");
            }
        });
        Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        };
        Thread t1 = new Thread(task1);
        t1.start();
        t2.start();

        new Thread(task3).start();

    }
}
