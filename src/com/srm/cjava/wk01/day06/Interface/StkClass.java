package com.srm.cjava.wk01.day06.Interface;

import java.util.Stack;

public class StkClass<INTEGER> implements StackInterface<INTEGER> {

    @Override
    public void pushpop() {
        Stack<Integer> stk = new Stack<>();
        stk.push(23);
        stk.push(3);
        stk.push(65);
        stk.push(1);
        System.out.println("Original Stack: "+stk);
        System.out.println(stk.pop());
        System.out.println("Stack after pop is done: "+stk);  
    }

}
