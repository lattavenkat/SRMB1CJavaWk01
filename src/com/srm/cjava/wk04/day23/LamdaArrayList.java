package com.srm.cjava.wk04.day23;

import java.util.ArrayList;
import java.util.Scanner;

public class LamdaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Please enter name: ");
        for (int i = 0; i < 5; i++) {
            answer = sc.nextLine();
            names.add(answer);
        }
        System.out.print("ArrayList: ");
        names.forEach((e) -> {
            System.out.print(e + ", ");
        });
        sc.close();
    }
}
