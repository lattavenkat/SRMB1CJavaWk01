package com.srm.cjava.wk04.day22.Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lambda_Args{
        public static List<Integer> filter(LamdaInterface testNum, List<Integer> listItems) {
            List<Integer> result = new ArrayList<Integer>();
            for(Integer item: listItems) {
                if(testNum.test(item)) {
                    result.add(item);
                }
            }
            return result;
        }
        public static void main(String[] args) {
            List<Integer> myList = new ArrayList<Integer>();
            myList.add(1);
            myList.add(4);
            myList.add(6);
            myList.add(7);
           
            Collection<Integer> values = filter(n -> n > 5, myList);
    
            System.out.println("Filtered values " + values);
        }
    }