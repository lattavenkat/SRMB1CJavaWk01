package com.srm.cjava.wk02.day09;

import java.util.LinkedList;

class Employee {
    private int eno;
    private String name;
    private String designation;

    Employee(int eno, String name, String designation) {
        this.eno = eno;
        this.name = name;
        this.designation = designation;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return " \nEmployee [designation=" + designation + ", eno=" + eno + ", name=" + name + "]";
    }

}

public class MyLinkList {
    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<>();

        list.add(new Employee(1, "Abi", "programmer"));
        list.add(new Employee(2, "Anu", "programmer"));
        list.add(new Employee(3, "Nithi", "Developer"));
        list.add(new Employee(4, "Akash", "Manager"));
        list.add(new Employee(2, "Aro", "Designer"));
       
        System.out.println("Linked List Content: " + list );
        
        System.out.println(list.getFirst());

        System.out.println(list);

    }
}
