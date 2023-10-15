import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Clientsqua {
    public static void main(String[] args) {
        try (
                Socket s = new Socket("localhost", 1080);
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()))) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number");
            int x = input.nextInt();
            bw.write(Integer.toString(x));
            bw.newLine();

            bw.flush();

            String result = br.readLine();
            System.out.println(result);
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}