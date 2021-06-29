package com.srm.cjava.wk01.day05;

public class FiboMultiThreading extends Thread{
    private int x;
    public int res;
 
    FiboMultiThreading(int x) {
        this.x = x;
    }
 
    public void run() {
        if (x == 0){ 
            res = 0;
        }
        else if( x == 1 || x == 2 ) {
            res = 1;
        }
        else {
            try {
                
                FiboMultiThreading fibo1 = new FiboMultiThreading(x-1);
                FiboMultiThreading fibo2 = new FiboMultiThreading(x-2);
                fibo1.start();
                fibo2.start();
                fibo1.join();
                fibo2.join();
                res = fibo1.res + fibo2.res;
            }catch(InterruptedException ex) { 
                ex.printStackTrace();
            }
        }
    }
 
    public static void main(String[] args){
        try {
            int inputNum = 8;
            FiboMultiThreading f = new FiboMultiThreading(inputNum);
            f.start();
            f.join();
            System.out.println("Fibonacci number at "+inputNum+" position is: "+f.res);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
