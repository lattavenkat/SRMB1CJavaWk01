package com.srm.cjava.wk01.day02;


public class Number {
    
    private double num;

    public Number(double num) {
        this.num = num;
    }
    public double getNum() {
        return num;
    }
    public void setNum(double num) {
        this.num = num;
    }
    //ZERO
    public boolean zero() {
        if (this.num == 0) {
            return true;
        } else {
            return false;
        }
    }
    //POSITIVE
    public boolean positive() {
        if(this.num > 0) {
            return true;
        } else {
            return false;
        }
    }
    //NEGATIVE
    public boolean negative() {
        if (this.num < 0) {
            return true;
        } else {
            return false;
        }
    }
    //EVEN NUMBER
    public boolean even() {
        if (this.num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    //ODD NUMBER
    public boolean odd() {
        if (this.num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
    //PRIME NUMBER
    public boolean prime() {
        int i;
        int m = 0;
        int flag = 0;
        int n = (int) this.num;
        m = n / 2;
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    return false;
                }
            }
            if (flag == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
    //AMSTRONG NUMBER
    public boolean armstrong() {
        int b = 0;
        int a;
        int temp;
        int n = (int) this.num;
        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            b = b + (a * a * a);
        }
        if (temp == b) {
            return true;
        } else {
            return false;
        }
    }
    //FACTORIAL NUMBER
    public double factorial() {
        int n = (int) this.num;
        long res = 1;
        for (int k = 1; k <= n; k++){
            res *= k;
        }
        return res;
    }
    //SQUARE ROOT OF A NUMBER
    public double sqrt() {
        return (Math.sqrt(this.num));
    }
    //SQUARE OF A NUMBER
    public double sqr() {
        return (this.num * this.num);
    }
    //SUM OF DIGITS
    public double sumDigit() {
        int n = (int) this.num;
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    //REVERSING
    public double reverse() {
        int num1 = (int) this.num;
        int reversed = 0;
        while (num1 != 0) {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
            num1 /= 10;
        }
        return reversed;
    }
    //BINARY VALUE
    public void binary(){
        int x = (int) this.num;
        System.out.println("The Binary value is: " + Integer.toBinaryString(x));
    }
    //FACTORIAL
    public void factor(){
        int n = (int) this.num;
        System.out.println("\nThe factors of " + n + " are: ");
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}


