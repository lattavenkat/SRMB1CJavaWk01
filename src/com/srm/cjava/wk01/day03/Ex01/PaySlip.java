package com.srm.cjava.wk01.day03.Ex01;

import java.util.Scanner;

public class PaySlip {
    public static void main(String[] args) {
        System.out.println("\n 1.Programmer\n2.Assistant_Professor\n3.Associate_Professor\n4.Professor");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int ch = sc.nextInt();
        switch (ch) {

            case 1:
                Employee e1 = new Employee();
                Programmer p1 = new Programmer();
                e1.empName = "Latha";
                e1.address = "Chennai";
                e1.mailId = "Latha@gmail.com";
                e1.empId = 1;
                e1.mobileNumber = 987656756;
                p1.bp = 20000;
                p1.display();
                e1.display();
                break;
            case 2:
                Employee e2 = new Employee();
                AssistantProfessor p2 = new AssistantProfessor();
                e2.empName = "Misha";
                e2.address = "Coimbatore";
                e2.mailId = "Misha@gmail.com";
                e2.empId = 2;
                e2.mobileNumber = 945687321;
                p2.bp = 35000;
                p2.display();
                e2.display();
                break;
            case 3:
                Employee e3 = new Employee();
                AssociateProfessor p3 = new AssociateProfessor();
                e3.empName = "Nithin";
                e3.address = "Hydrabad";
                e3.mailId = "Nithin@gmail.com";
                e3.empId = 3;
                e3.mobileNumber = 987598710;
                p3.bp = 35000;
                p3.display();
                e3.display();
                break;
            case 4:
                Employee e4 = new Employee();
                Professor p4 = new Professor();
                e4.empName = "Arron";
                e4.address = "TRICHY";
                e4.mailId = "arron@gmail.com";
                e4.empId = 4;
                e4.mobileNumber = 984067510;
                p4.bp = 37000;
                p4.display();
                e4.display();
                break;
            default:
                System.out.println("Invalid Choice!");

        }
        sc.close();
    }
}
