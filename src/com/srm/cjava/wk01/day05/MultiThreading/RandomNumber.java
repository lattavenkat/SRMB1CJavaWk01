package com.srm.cjava.wk01.day05.MultiThreading;
import java.util.Random;

public class RandomNumber extends Thread {
    public void run() {
        Random random = new Random();
        int randomint = random.nextInt(300);
        System.out.println("Random Integer generated : " + randomint);
        if (randomint % 2 == 0) {
            Square s = new Square(randomint);
            s.start();
        } 
        else {
            Cube c = new Cube(randomint);
            c.start();
        }
        try {
            Thread.sleep(1000);
        }
         catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
