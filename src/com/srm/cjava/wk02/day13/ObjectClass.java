package com.srm.cjava.wk02.day13;

class Employee {
    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void namechange() {
        String newname = name.concat("Latha");
        System.out.println("After concatenating name with Latha : " + newname);
    }
}

class Manager {
    private String jobtitle;
    private double payrate;
Manager( String jobtitle,double payrate) {
    this.jobtitle = jobtitle;
    this.payrate = payrate;
}
    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getPayrate() {
        return payrate;
    }

    public void setPayrate(double payrate) {
        this.payrate = payrate;
    }

    public void paychange() {
        double newpay = payrate + 5000.00;
        System.out.println("New payrate after adding Rs.5000 is : " + newpay);
    }

}

public class ObjectClass {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Ms.");
        Manager m = new Manager("Developer", 40000.00);
        Object o1 = new Object();
        Object o2 = new Object();
        m.paychange();
        e.namechange();
        o1=e.getClass();
        System.out.println("Class 1 : " + o1);
        o2=m.getClass();
        System.out.println("Class 2 : " + o2);

    }
}
