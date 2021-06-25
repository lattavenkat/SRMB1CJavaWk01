package com.srm.cjava.wk01.day03;

abstract class Pen {
    public abstract void write();
    public abstract void refill();
}

public class FountainPen extends Pen {
    public void write() {
        System.out.println("--WRITE -- OVERRIDING ABSTRACT METHOD");
    }

    public void refill() {
        System.out.println("REFILL -- WRITE--OVERRIDING ABSTRACT METHOD");
    }

    public void nib() {
        System.out.println("INSIDE NIB METHOD");
    }

    public static void main(String[] args) {
        FountainPen obj = new FountainPen();
        obj.write();
        obj.refill();
        obj.nib();

    }
}
