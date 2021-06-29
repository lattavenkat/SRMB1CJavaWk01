package com.srm.cjava.wk01.day04.UserDefinedExcp;

import java.util.Scanner;

public class Employee {
    int eno;
    String ename;
   
    static void validate(float bpay)throws PayOutOfBoundExcp{  
        if(bpay<=0)  
         throw new PayOutOfBoundExcp("not valid");  
        else  
         System.out.println("Earn Nicely, spend wisely and you will live happily!");  
      }  
        
      public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Pay : ");
        float n = sc.nextFloat();
        try{
            validate(n);
        } catch (Exception e) {
            System.out.println("EXCEPTION OCCURED!: " + e);
        }
        sc.close(); 
     }  
}
