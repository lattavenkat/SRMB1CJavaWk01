package com.srm.cjava.wk02.day09;

import java.util.HashMap;
import java.util.Scanner;

class PrintMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Carole and Tuesday");
        map.put(2, "The Promised Neverland");
        map.put(3, "Vinland Saga");
        map.put(4, "Demon Slayer");
        map.put(5, "Dr.Stone");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Printing key and values of Map:" + map);
        System.out.println("Fetching map values" + map.values());
        System.out.println("Checking if the key 6 is present in map " + map.containsKey(6));
        System.out.println("HashCode value for the map " + map.hashCode());
    }
}