
import java.net.*;

public class ip_4 {
    public static void main(String[] args) {

        try {

            URL url1 = new URL("https://www.geeksforgeeks.org/java/");
            // URL url2Url = new URL("http://httpbin.org/");
            System.out.println(url1.getProtocol());
            System.out.println(url1.getPort());
            System.out.println(url1.getDefaultPort());
            System.out.println(url1.getFile());
            System.out.println(url1.getHost());
            System.out.println(url1.getContent());

        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
