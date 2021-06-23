package com.srm.cjava.wk01.day02;

public class ViewBill {
    public static void main(String[] args) {
        EbBill ob1 = new EbBill(1,"Latha",889,1300,"Domastic");
        EbBill ob2 = new EbBill(2,"Misha",5999,8999,"commercial");
        ob1.genBill();
        ob1.displayBill();
        ob2.genBill();
        ob2.displayBill();

        
    }
}
