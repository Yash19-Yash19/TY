import java.io.*;
import java.net.*;
import java.util.Scanner;

public class lc {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); // Connect to the server on localhost and port 12345

            // Create input and output streams for communication with the server
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            // Send two numbers to the server
            // int number1 = 10; // Replace with your first number
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // input.close();

            // int number2 = 20; // Replace with your second number
            output.writeInt(num1);
            output.writeInt(num2);

            // Receive the largest number from the server
            int largest = input.readInt();
            System.out.println("The largest number is: " + largest);

            // Close the connection with the server
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
