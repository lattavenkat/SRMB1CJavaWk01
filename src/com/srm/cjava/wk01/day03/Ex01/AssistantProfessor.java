package com.srm.cjava.wk01.day03.Ex01;

public class AssistantProfessor extends Employee {
    int bp;

    void display() {
        System.out.println(bp);
        System.out.println("DA" + 0.97 * bp);
        System.out.println("HRA" + 0.10 * bp);
        System.out.println("PF" + 0.12 * bp);
        System.out.println("STAFF CLUB FUND" + 0.001 * bp);
    }
}
