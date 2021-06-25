package com.srm.cjava.wk01.day03;

abstract class Telephone {
    public abstract void lift();
    public abstract void disconnected();
}

class SmartTelephone extends Telephone {
    public void lift() {
        System.out.println(("INSIDE LIFT METHOD"));
    }

    public void disconnected() {
        System.out.println("INSIDE DISCONNECTED METHOD");
    }
  }
class Teleph{
    public static void main(String[] args) {
        Telephone obj = new SmartTelephone();
        obj.lift();
        obj.disconnected();
    }
}

