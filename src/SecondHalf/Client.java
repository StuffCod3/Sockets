package SecondHalf;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println(line);


        printWriter.close();
        socket.close();
    }
}
