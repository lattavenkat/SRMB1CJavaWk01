package com.srm.cjava.wk02.day12;

import java.util.HashSet;
import java.util.Iterator;

class MyOwnClass {
    private String name;
    private int age;

    MyOwnClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
 @Override
    public String toString() {
        return "Values in 'MyOwnClass' [age=" + age + ", name=" + name + "]\n";
    }

}

class HashSetObj {
    public static void main(String[] args) {
        HashSet<MyOwnClass> hs = new HashSet<MyOwnClass>();
        hs.add(new MyOwnClass("Karthik", 27));
        hs.add(new MyOwnClass("Latha", 17));
        hs.add(new MyOwnClass("Yash", 19));
        hs.add(new MyOwnClass("Bachu", 60));
      
        Iterator<MyOwnClass> i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("\n" +hs);
    }
}