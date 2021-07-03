package com.srm.cjava.wk02.day10;

public class EmployeeDetaiols {
    private int roll;
    private String name;
    private int age;
    private String desig;
    public EmployeeDetaiols(int roll, String name, int age, String desig) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.desig = desig;
    }

    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDesig() {
        return desig;
    }
    public void setDesig(String desig) {
        this.desig = desig;
    }
    @Override
    public String toString() {
        return "Emplo [age=" + age + ", desig=" + desig + ", name=" + name + ", roll=" + roll + "]";
    }
}
