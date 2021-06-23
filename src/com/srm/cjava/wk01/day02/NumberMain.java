package com.srm.cjava.wk01.day02;

public class NumberMain {

    public static void main(String[] args) {
        Number n = new Number(55);
        System.out.println("Is Zero: " + n.zero());
        System.out.println("Is Positive: " + n.positive());
        System.out.println("Is Negative: " + n.negative());
        System.out.println("Is Odd: " + n.odd());
        System.out.println("Is Even: " + n.even());
        System.out.println("Is Prime: " + n.prime());
        System.out.println("Is Armstrong: " + n.armstrong());
        System.out.println("Factorial is: " + n.factorial());
        System.out.println("Square is: " + n.sqr());
        System.out.println("Square root is: " + n.sqrt());
        System.out.println("Sum of Digits is: " + n.sumDigit());
        System.out.println("Reverse no :" + n.reverse());
        n.factor();
        n.binary();
    }
}
