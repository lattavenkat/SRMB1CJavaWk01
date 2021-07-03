package com.srm.cjava.wk02.day11;

import java.util.Vector;

public class VectorSum {

    public static void main(String[] args) {

        // int sumv1 = 0;
        // int sumv2 = 0;
        // Addition ob = new Addition();

        // for (int element : v1) {
        // sumv1 += element;
        // }
        // for (int element : v2) {
        // sumv2 += element;
        // }
        // int sum = sumv1 + sumv2;
        // System.out.println("After Adding two vectors:" + sum);
        // for(int i=0;i<=3;i++){
        // for(int j=0;j<=3;j++){
        // sum = v1.elementAt(i) + v2.elementAt(j);
        // }
        // }
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();
        
        v1.add(5);
        v1.add(15);
        v1.add(20);

        v2.add(5);
        v2.add(5);
        v2.add(10);
        System.out.println("Vector 1: "+v1);
        System.out.println("Vector 1: "+v2);
        System.out.println("After Adding two vectors: ");
        Vector<Integer> v3 = new Vector<>();
        for (int i = 0; i < v1.size(); i++) {
            int a = v1.get(i) + v2.get(i);
            v3.add(a);
        }
        System.out.println(v3);
    }
}
