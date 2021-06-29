package com.srm.cjava.wk01.day06.Interface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StkClass<T> implements StackInterface<T> {
    Scanner sc = new Scanner(System.in);
   
    ArrayList<T> arr;
    int top = -1;
    int size;

    StkClass(int size) {
        this.size = size;
        this.arr = new ArrayList<T>(size);
    }
    Stack<Integer> stk1 = new Stack<Integer>();

    public void pop( ) {
        System.out.println("Removing element at top of the stack(POP) got popped: " + stk1.pop());
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else
            top--;
    }

    @Override
    public void push(T X) {
        if (top + 1 == size) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            if (arr.size() > top)
                arr.set(top, X);
            else
                arr.add(X);
        }
    }
}
