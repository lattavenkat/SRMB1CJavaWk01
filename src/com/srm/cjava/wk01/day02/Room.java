package com.srm.cjava.wk01.day02;

public class Room {
    public static void main(String[] args) {
        RoomInfo r1 = new RoomInfo();
    
    r1.setRoomDetails(1, "HALL", 1300, true);
    r1.displayRoomDetails();
    r1.setRoomDetails(2, "KITCHEN", 600, false);
    r1.displayRoomDetails();
    r1.setRoomDetails(3, "BedRoom", 800, true);
    r1.displayRoomDetails();
}

    
}
