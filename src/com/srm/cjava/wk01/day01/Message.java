package com.srm.cjava.wk01.day01;

import java.util.logging.Logger;

class Message {
    public static final Logger logg = Logger.getLogger(Message.class.getName());

    public static void main(String[] args) {
        logg.info("Print statement inside Logger");
        System.out.println("Basic print Program");
    }
}