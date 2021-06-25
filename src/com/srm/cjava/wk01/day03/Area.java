package com.srm.cjava.wk01.day03;

class ShapeRectangle {
    protected int length;
    protected int breadth;

    ShapeRectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public void area() {
        System.out.println("Area of rectangle: " + (this.length * this.breadth));
    }

    public void perimeter() {
        System.out.println("Perimeter of rectangle: " + (2 * (this.length + this.breadth)));
    }
}

class ShapeSquare extends ShapeRectangle {
    protected int a;

    ShapeSquare(int l, int b, int a) {
        super(l, b);
        this.a = a;

    }

    public void areasquare() {
        System.out.println("Area of square: " + (this.a * this.a));
    }

}

class Area {
    public static void main(String[] args) {
        ShapeSquare ob = new ShapeSquare(9,17,30);
        ob.area();
        ob.perimeter();
        ob.areasquare();
    }
}
