package com.srm.cjava.Test.BankAcc;

public class Account {

    public static void main(String[] args) {

        AccClass ob1 = new AccClass("latha", 50000);
        AccClass ob2 = new AccClass("venkat", 20000);

        System.out.printf("Initial balance of :  " + ob1.getAccountName() + " " + ob1.getBalance());

        System.out.printf("\nInitial balance of:  " + ob2.getAccountName() + " " + ob2.getBalance());
        ob1.Fundtransfer1(ob2, 1000);

        System.out.println("\nAfter Fund transfer: ");
        System.out.printf(" New Account balance  of" + ob1.getAccountName() + " " + ob1.getBalance());

        System.out.printf("\nNew Account balance of " + ob2.getAccountName() + " " + ob2.getBalance());
        ob2.Fundtransfer2(ob1, 2000);
        System.out.println("\nAfter transferring Rs.1000 to both the accounts...");
        System.out.printf("\nNew Balance of " + ob1.getAccountName() + " " + ob1.getBalance());

        System.out.printf("\nNew Balance of " + ob2.getAccountName() + " " + ob2.getBalance());
    }
}
