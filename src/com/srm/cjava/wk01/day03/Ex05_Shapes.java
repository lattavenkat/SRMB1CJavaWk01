package com.srm.cjava.wk01.day03;

class Shape {
    public void printshape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    public void printrect() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    public void printcircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    public void printsquare() {
        System.out.println("Square is a rectangle");
    }
}

public class Ex05_Shapes {
    public static void main(String[] args) {
        Square ob = new Square();
        System.out.println("-----PRINTING METHODS OF SHAPE AND RECTANGLE CLASS-----");
        ob.printshape();
        ob.printrect();
    }
}
