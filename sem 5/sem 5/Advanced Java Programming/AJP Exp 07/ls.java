import java.io.*;
import java.net.*;

public class ls {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Create a server socket on port 12345
            System.out.println("Server is running. Waiting for clients...");

            while (true) {
                Socket clientSocket = serverSocket.accept(); // Accept client connections
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                // Create input and output streams for communication with the client
                DataInputStream input = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());

                // Read two numbers from the client
                int num1 = input.readInt();
                int num2 = input.readInt();

                // Determine the largest number
                int largest = Math.max(num1, num2);

                // Send the largest number back to the client
                output.writeInt(largest);

                // Close the connection with the client
                clientSocket.close();
                System.out.println("Client disconnected");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
