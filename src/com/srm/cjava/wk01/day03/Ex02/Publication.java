package com.srm.cjava.wk01.day03.Ex02;




class Publication {
     String title;
     float bookprice;

    void getdatapub(String tit, float bp) {
        this.title = tit;
        this.bookprice = bp;
    }

    void displaypub() {
        System.out.println("Enter title of publication: " + this.title);
        System.out.println("Enter price of publication(float): " + this.bookprice);
    }
}

class Book extends Publication {
     int pagecount;

    void getdata(int pc) {
        this.pagecount = pc;
    }

    void display() {
        System.out.println("Enter Book Page Count(int): " + this.pagecount);
    }
}

class Cd extends Publication {
     float playtime;

    void getdata(float pt) {
        this.playtime = pt;
    }

    void display() {
        System.out.println("Enter CD tape's playing time(Float): " + this.playtime);
    }
}

class Pub {
    public static void main(String[] args) {
        Cd c1 = new Cd();
        c1.getdatapub("MERRY",5423.12f);
        c1.getdata(62.15f);
        c1.displaypub();
        c1.display();

        Book b1 = new Book();
        b1.getdata(154);
        b1.getdatapub("FLAWLESS", 347.5f);
        b1.display();
        b1.displaypub();
    }
}



