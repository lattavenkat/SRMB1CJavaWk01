package com.srm.cjava.wk01.day04.Package02.p2;
import com.srm.cjava.wk01.day04.Package02.p1.ClassA;


class ClassB {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("Example of package that import another package");
        ClassA obj= new ClassA(); 
        obj.display();
    }
}
