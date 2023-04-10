package SecondHalf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);

        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println(inputLine);
        printWriter.flush();

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());


        try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println("Соединение закрыто");
        }

        printWriter.close();
        socket.close();
    }
}
