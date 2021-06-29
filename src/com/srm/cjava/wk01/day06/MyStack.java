package com.srm.cjava.wk01.day06;

import java.util.ArrayList;
import java.util.Stack;

class stack<T> {

    ArrayList<T> arr;
    int top = -1;
    int size;

    stack(int size) {
        this.size = size;
        this.arr = new ArrayList<T>(size);
    }

    void push(T X) {

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

    T top() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else
            return arr.get(top);
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else
            top--;
    }

    boolean empty() {
        return top == -1;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < top; i++) {
            res += String.valueOf(arr.get(i)) + " , ";
        }
        res += String.valueOf(arr.get(top));
        return res;
    }
}

class MyStack {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("STACK THAT ACCEPTS INTEGER DATA VALUES");
        System.out.println("-------------------------------------");
        Stack<Integer> stk1 = new Stack<Integer>();
        stk1.push(6);
        stk1.push(8);
        stk1.push(97);
        System.out.println("After pushing 6, 8 and 97 :\n" + stk1);
        stk1.pop();
        System.out.println("After pop : \n" + stk1);

        System.out.println("-------------------------------------");
        System.out.println("STACK THAT ACCEPTS STRING DATA VALUES");
        System.out.println("-------------------------------------");
        stack<String> stk2 = new stack<>(4);
        stk2.push("Latha");
        stk2.push("ChiChi");
        stk2.push("Gomathi");
        System.out.println("\nAfter pushing 3 elements : \n" + stk2);
        stk2.push("Akash");
        System.out.println("After pushing 4th element : " + stk2);
        
        System.out.println("-------------------------------------");
        System.out.println("STACK THAT ACCEPTS FLOAT DATA VALUES");
        System.out.println("-------------------------------------");
        stack<Float> stk3 = new stack<>(2);
        stk3.push(60.5f);
        stk3.push(55.6f);
        System.out.println("\nAfter pushing 2 elements :\n" + stk3);
        System.out.println("Retrieving top element of stack:\n" + stk3.top()); // }
    }

}