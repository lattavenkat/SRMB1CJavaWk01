package com.srm.cjava.Test.TcpIpClientServer;

import java.net.*;

class Receiver {
    private final static int BUFSIZE = 20;

    public static void main(String a[]) {
        try {
            int port = Integer.parseInt(a[0]);
            DatagramSocket ds = new DatagramSocket(port);
            byte buffer[] = new byte[BUFSIZE];
            while (true) {
             DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
                ds.receive(dp);
                String str = new String(dp.getData());
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
