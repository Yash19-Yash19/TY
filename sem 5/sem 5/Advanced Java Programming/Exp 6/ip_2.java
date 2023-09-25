import java.net.*;

public class ip_2 {
    public static void main(String[] args) {

        try {
            InetAddress ip2 = InetAddress.getLocalHost();
            System.out.println("Host Name: " + ip2.getHostName());
            System.out.println("IP Address: " + ip2.getHostAddress());

        }

        catch (Exception e) {
            System.out.println(e);
        }

    }
}