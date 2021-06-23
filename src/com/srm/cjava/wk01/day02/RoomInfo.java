package com.srm.cjava.wk01.day02;

public class RoomInfo {
     int roomno;
     String roomtype;
     int roomarea;
     boolean ac;
    public void setRoomDetails(int no, String type, int area, boolean ac){
        this.roomno = no;
        this.roomtype = type;
        this.roomarea = area;
        this.ac = ac; 
    }
    public void displayRoomDetails(){
        System.out.println("Room Number: " + this.roomno);
        System.out.println("Room Type: " + this.roomtype);
        System.out.println("Room Area: " + this.roomarea);
        System.out.println("Is AC Available: " + this.ac);
    }

}
