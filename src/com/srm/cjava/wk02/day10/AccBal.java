package com.srm.cjava.wk02.day10;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Acc{
    private long accno;
    private double bal;
    public Acc(long accno, double bal) {
        this.accno = accno;
        this.bal = bal;
    }
    public long getAccno() {
        return accno;
    }
    public void setAccno(long accno) {
        this.accno = accno;
    }
    public double getBal() {
        return bal;
    }
    public void setBal(double bal) {
        this.bal = bal;
    }
    @Override
    public String toString() {
        return "Acc [accno=" + accno + ", bal=" + bal + "]";
    }

    
}
public class AccBal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		TreeMap<Integer,Acc> tm=new TreeMap<Integer,Acc>();
		tm.put(4, new Acc(99991234, 25000.90));
		tm.put(2, new Acc(99994321, 100000.35));
		tm.put(1, new Acc(99991357, 15000.20));
		tm.put(6, new Acc(99992468, 56000.40));
		tm.put(9, new Acc(99999753, 200000.00));
        System.out.println("Map Values");
        System.out.println(tm);
        Set<Map.Entry<Integer, Acc>> entries = tm.entrySet();

        for (Map.Entry<Integer, Acc> entry : entries) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
     System.out.println("Enter the Account Number:");
        long acc = sc.nextLong();

        for (Map.Entry<Integer, Acc> ent : tm.entrySet()) {
            Acc nacc = ent.getValue();

            if (acc  == nacc.getAccno()){
                System.out.println(ent.getKey() + "=>" + ent.getValue());
            }
        }
		sc.close();
    }
}
