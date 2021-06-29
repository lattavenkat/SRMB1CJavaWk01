package com.srm.cjava.wk01.day05;

public class DeadLock {
    final static Object res1 = new Object();
    final static Object res2 = new Object();

    public static void main(String[] args) throws InterruptedException{
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
      
        // Thread2.sleep(100);
        
    }
}
    class Thread1 extends Thread {

        public void run() {
            synchronized (DeadLock.res1) {
                System.out.println("\nThread 1: Locked X");
                try {
                    Thread1.sleep(100);
               } 
                catch (Exception e) {
                }
                synchronized (DeadLock.res2) {
                    System.out.println("\nThread 1: Locked Y");
                }
            }
        }
    }

    class Thread2 extends Thread {
        public void run() {

            synchronized (DeadLock.res2) {
                System.out.println("Thread 2: Locked X");
                try {
                   Thread2.sleep(100);
                } 
                catch (Exception e) {
                }
                synchronized (DeadLock.res1) {
                    System.out.println("Thread 2: Locked Y");
                }
            }
        }
    }
