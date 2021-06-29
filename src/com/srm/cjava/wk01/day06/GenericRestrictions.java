package com.srm.cjava.wk01.day06;

class Restrict<T extends Number> {
    T obj;
    T vals[];
  
    Restrict(T obj, T[] nums) {
      this.obj = obj;
      this.vals = nums;
    }
    void view(){
        System.out.println("\n" +this.obj + " : " +this.vals );
    }
  }
  
  public class GenericRestrictions {
    public static void main(String args[]) {
      Integer n[] = { 5 };
      Restrict<Integer> iOb = new Restrict<Integer>(100, n);
        iOb.view();
      Restrict<?> gen[] = new Restrict<?>[10];
    }
  }
