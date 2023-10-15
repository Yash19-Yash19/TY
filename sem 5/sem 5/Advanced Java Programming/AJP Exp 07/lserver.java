import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class lserver {
    public static void main(String[] args) {
        System.out.println("Listening.");
        try (
                ServerSocket server = new ServerSocket(1082);
                Socket s = server.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()))) {
            System.out.println("Connected.");
            int num1 = Integer.parseInt(br.readLine());
            int num2 = Integer.parseInt(br.readLine());

            if (num1 > num2) {
                bw.newLine();
                bw.write(num1 + " is larger than " + num2);
            } else if (num2 > num1) {
                bw.newLine();
                bw.write(num2 + " is larger than " + num1);
            } else {
                bw.newLine();
                bw.write("Both numbers are equal");
            }
            bw.newLine();

            bw.flush();
            bw.newLine();

            bw.flush();
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}