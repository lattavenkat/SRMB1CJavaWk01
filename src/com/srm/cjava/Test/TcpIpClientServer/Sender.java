package com.srm.cjava.Test.TcpIpClientServer;

import java.net.*;

class Sender {
    public static void main(String a[]) {
        try {
            InetAddress ia = InetAddress.getByName(a[0]);
            int port = Integer.parseInt(a[1]);
            DatagramSocket ds = new DatagramSocket();
            byte buffer[] = a[2].getBytes();
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length, ia, port);
            ds.send(dp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}