package com.srm.cjava.Test.BankAcc;

public class AccClass {
    private String accountName;
    private double balance;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccClass(String accountNum, double balance) {
        this.accountName = accountNum;
        this.balance = balance;
    }

    public void credit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }

    public void debit(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
    }

    @Override
    public String toString() {
        return "AccClass [accountNum=" + accountName + ", balance=" + balance + "]";
    }
    public void Fundtransfer1(AccClass destination, double amount) {
        destination.balance = destination.balance + amount;

        this.balance = this.balance - amount;
    }

    public void Fundtransfer2(AccClass destination, double amount) {
        destination.credit(amount);
        this.debit(amount);
    }
}
