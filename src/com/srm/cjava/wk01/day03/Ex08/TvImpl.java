package com.srm.cjava.wk01.day03.Ex08;


public class TvImpl implements SmartTvRemote {

    @Override
    public void on() {
        System.out.println("TV on.");
        
    }

    @Override
    public void off() {
        System.out.println("TV off.");
        
    }

    @Override
    public void Youtube(boolean yt) {
        if(yt){
        System.out.println("Youtube on.");
        }else{
            System.out.println("Youtube off.");
        }
        
    }

}
