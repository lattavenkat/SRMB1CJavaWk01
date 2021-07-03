package com.srm.cjava.wk02.day10;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Directory{
    private String name;
    private long phone;
    public Directory( long phoneno,String name) {
        this.name = name;
        this.phone = phoneno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "PhoneDirectory [Name=" + name + ", Phone=" + phone + "]";
    }
}
class PhoneDirectory {
    public static void main(String[] args) {
        TreeMap<Integer, Directory> tm = new TreeMap<Integer, Directory>();
        tm.put(44, new Directory(1234567, "Latha"));
        tm.put(99, new Directory(673344543, "Anushya"));
        tm.put(92, new Directory(876545677, "Ram"));
        tm.put(91, new Directory(876567766, "Chandler"));
        tm.put(61, new Directory(871115224, "Lisha"));
        System.out.println("TREE MAP-KEY SORTED BY DEFAULT: " + tm);
        Scanner sc = new Scanner(System.in);
        Set<Map.Entry<Integer, Directory>> x = tm.entrySet();

        for (Map.Entry<Integer, Directory> y : x) {
            System.out.println(y.getKey() + "---" + y.getValue());
        }

        System.out.println("Enter the Phone Number: ");
        long num = sc.nextLong();

        for (Map.Entry<Integer, Directory> ent : tm.entrySet()) {
            Directory dir = ent.getValue();

            if (num == dir.getPhone()) {
                System.out.println(ent.getKey() + "---" + ent.getValue());
            }
        }

        System.out.println("Enter the Name: ");
        String nam = sc.next();

        for (Map.Entry<Integer, Directory> ent1 : tm.entrySet()) {
            Directory ntm = ent1.getValue();

            if (nam.equalsIgnoreCase(ntm.getName())){
                System.out.println(ent1.getKey() + "---" + ent1.getValue());
            }
        }

        sc.close();
        
    }
}