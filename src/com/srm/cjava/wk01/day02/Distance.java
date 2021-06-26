package com.srm.cjava.wk01.day02;

public class Distance {
    public static void main(String[] args) {
        Point p1 = new Point(5, 9);
        Point p2 = new Point(3, 8);
        calculate(p1,p2);
    }

    public static void calculate(Point p, Point q) {

        double distance;

        double point1 = Math.pow((q.getX() - p.getX()), 2);
        double point2 = Math.pow((q.getY() - p.getY()), 2);
        double points = point1 + point2;
        distance = Math.sqrt(points);
        System.out.println("The distance between two " +point1+ " and " +point2+ " is: " + distance);
    }
}
