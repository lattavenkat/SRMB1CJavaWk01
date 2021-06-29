package com.srm.cjava.wk01.day04.UserDefinedExcp;

public class MarkOutofBoundExcp extends Exception {
    MarkOutofBoundExcp(String s){
       super(s);
    }
}
