package com.srm.cjava.wk02.day08;
import java.util.ArrayList;
public class Replacingele {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Latha");
        arr.add("Amul");
        arr.add("Lokesh");
        arr.add("Venkat");
        arr.add("Sumathy");
        System.out.println(arr);
       
        for(int i=0; i < arr.size(); i++) 
        {
            if(arr.get(i).equalsIgnoreCase("Lokesh")) {
                arr.set(i, "Karthik");
            }
        } 
        System.out.println(arr);
    }
}
