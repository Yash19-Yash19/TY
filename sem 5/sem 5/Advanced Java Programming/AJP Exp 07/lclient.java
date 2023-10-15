import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class lclient {
    public static void main(String[] args) {
        try (
                Socket s = new Socket("localhost", 1082);
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()))) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number");

            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            input.close();

            bw.write(Integer.toString(num1));
            bw.write(Integer.toString(num2));
            bw.newLine();

            bw.flush();

            String result = br.readLine();
            System.out.println(result);

            

        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}