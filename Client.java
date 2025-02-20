#Client Code:
import java.io.*;
import java.net.*;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter serverOutput = new PrintWriter(socket.getOutputStream(), true)) {

            // Get username
            System.out.println(serverInput.readLine());
            String username = userInput.readLine();
            serverOutput.println(username);

            // Start a thread to listen to the server messages
            Thread listenerThread = new Thread(new ServerListener(serverInput));
            listenerThread.start();

            String message;
            while (true) {
                message = userInput.readLine();
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
                serverOutput.println(message);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class ServerListener implements Runnable {
        private BufferedReader serverInput;

        public ServerListener(BufferedReader serverInput) {
            this.serverInput = serverInput;
        }

        @Override
        public void run() {
            String message;
            try {
                while ((message = serverInput.readLine()) != null) {
                    System.out.println(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
