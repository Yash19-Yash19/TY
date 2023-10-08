// Write a program using DatagramPacket and DatagramSocket to create chat application.

import java.net.*;

public class dtpktsn {

    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket();

        String str = "Hii there......";

        InetAddress ip = InetAddress.getByName("127.0.0.1");

        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);

        ds.send(dp);

        ds.close();

    }

}