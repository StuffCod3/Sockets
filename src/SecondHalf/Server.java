package SecondHalf;

import FirstHalf.FirstHalf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept();

        System.out.println("Client connected");

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        FirstHalf str = new FirstHalf(bufferedReader.readLine());
        System.out.println(str.getResult());

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println(str.getResult());
        printWriter.flush();

    }
}
