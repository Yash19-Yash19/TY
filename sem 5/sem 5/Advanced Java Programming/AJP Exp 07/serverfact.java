import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class serverfact {
    public static void main(String[] args) {
        System.out.println("Listening.");
        try (
                ServerSocket server = new ServerSocket(1081);
                Socket s = server.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()))) {
            System.out.println("Connected.");
            int x = Integer.parseInt(br.readLine());

            int fact = 1;
            fact = 1;
            for (int i = 1; i <= x; i++) {
                fact *= i;
            }
            bw.write("The  of " + x + " is " + fact);
            bw.newLine();

            bw.flush();
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}