package org.example.projava.chapterFour;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketException;

public class SimpleClient {
    public static void main(String[] args) throws IOException {

        try (var soc = new Socket("localhost", 1699);
            // Prepare to Send data to socket
            OutputStream output = soc.getOutputStream()) {
            // Send data
            output.write(234);
        } catch (ConnectException e) {
            System.err.println("サーバーが起動していません");
            e.printStackTrace();
        }


//        output.close();
//        soc.close();
    }
}
