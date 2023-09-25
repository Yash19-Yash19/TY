import java.net.*;

public class ip_1 {

    public static void main(String[] args) {

        try {

            InetAddress ip = InetAddress.getByName("www.youtube");

            System.out.println("Host Name: " + ip.getHostName());

            System.out.println("IP Address: " + ip.getHostAddress());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}