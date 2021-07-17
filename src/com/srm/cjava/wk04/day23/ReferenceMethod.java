package com.srm.cjava.wk04.day23;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ReferenceMethod {
    private String name;
    ReferenceMethod()
   {
      name = "latha";
   }
   ReferenceMethod(String name)
   {
      this.name = name;
      System.out.printf("MRDemo(String name) called with %s%n", name);
   }
   
    public static void methoddemo() {
        System.out.println("METHOD REFERENCE TO STATIC METHOD");
        int[] array = { 10, 2, 19, 5, 17 };
        Consumer<int[]> consumer = Arrays::sort;
        consumer.accept(array);
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
        System.out.println();
        int[] array2 = { 19, 5, 14, 3, 21, 4 };
        Consumer<int[]> consumer2 = (a) -> Arrays.sort(a);
        consumer2.accept(array2);
        for (int i = 0; i < array2.length; i++)
            System.out.println(array2[i]);
    }

    public void constructorDemo() {
        System.out.println("METHOD REFERENCE TO CONSTRUCTOR");
        Supplier<ReferenceMethod> supplier = ReferenceMethod::new;
        System.out.println(supplier.get());
    }

    

    public static void main(String[] args) {
        
      Function<String, ReferenceMethod> function = ReferenceMethod::new;
      System.out.println(function.apply("some name"));
   
        ReferenceMethod ob = new ReferenceMethod();
        ReferenceMethod.methoddemo();
        ob.constructorDemo();
        //instance method
        System.out.println("METHOD REFERENCE TO INSTANCE METHOD: ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentance: ");
        String s = sc.nextLine();
      print(s::length);
      print(() -> s.length());
      print(new Supplier<Integer>()
      {
         @Override
         public Integer get()
         {
            return s.length(); // closes over s
         }
      });
   }
   public static void print(Supplier<Integer> supplier)
   {
      System.out.println(supplier.get());
   }
    
}
