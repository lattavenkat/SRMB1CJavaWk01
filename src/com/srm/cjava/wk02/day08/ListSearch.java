package com.srm.cjava.wk02.day08;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListSearch {
    public static void main(String[] args) {
        System.out.println("SEARCHING LIST ELEMENTS");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Elements in List: "+list);
        ArrayList<Integer> al = new ArrayList<>();  
        int search=3;
        System.out.println("The element being searched is 3 ");
        for(int i=0;i<list.size();i++){
        if(list.get(i)==search){
            System.out.println("Element found at index " +i);
        }
        else{
            System.out.println("Element not found");
        }
        }
    }

}
