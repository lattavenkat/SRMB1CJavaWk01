package com.srm.cjava.wk02.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee {
    public static void main(String[] args) {
        ArrayList<EmployeeDetaiols> employ = new ArrayList<>();

        System.out.println("EmployeeDetaiolsyee List: \n");
        employ.add(new EmployeeDetaiols(1, "Karthik", 27, "Programmer"));
        employ.add(new EmployeeDetaiols(5, "Kutty", 26, "Developer"));
        employ.add(new EmployeeDetaiols(2, "Latha", 65, "Co-Founder"));
        employ.add(new EmployeeDetaiols(9, "Gomathy", 50, "Manager"));
        employ.add(new EmployeeDetaiols(7, "Chi Chi", 70, "Founder"));
        employ.add(new EmployeeDetaiols(3, "Sachin", 22, "Trainee"));

        for (EmployeeDetaiols e1 : employ) {
            System.out.println(e1);
        }

        Collections.sort(employ, new Comparator<EmployeeDetaiols>() {

            @Override
            public int compare(EmployeeDetaiols o1, EmployeeDetaiols o2) {
                return o1.getAge() - o2.getAge();
            }

        });
        System.out.println("Sorting by Age: ");
        for (EmployeeDetaiols e2 : employ) {
            System.out.println(e2);
        }

        Collections.sort(employ, new Comparator<EmployeeDetaiols>() {

            @Override
            public int compare(EmployeeDetaiols o1, EmployeeDetaiols o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });

        System.out.println("Sorting by Name: ");

        for (EmployeeDetaiols e3 : employ) {
            System.out.println(e3);
        }
    }
}
