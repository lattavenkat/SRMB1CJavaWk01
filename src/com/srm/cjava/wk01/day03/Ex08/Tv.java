package com.srm.cjava.wk01.day03.Ex08;

class Tv{
    public static void main(String[] args) {
        TvImpl tv = new TvImpl();
        tv.on();
        tv.Youtube(true);       
        tv.Youtube(false);
        tv.off();
    }
    
}

