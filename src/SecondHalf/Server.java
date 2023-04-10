package SecondHalf;

import FirstHalf.FirstHalf;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept();

        System.out.println("Client connected");

        Scanner in = new Scanner(socket.getInputStream());
        while (in.hasNext()){
            String inputStr = in.nextLine();
            FirstHalf str = new FirstHalf(inputStr);
            System.out.println(str.getResult());
        }

        in.close();
        socket.close();
        serverSocket.close();
    }
}
