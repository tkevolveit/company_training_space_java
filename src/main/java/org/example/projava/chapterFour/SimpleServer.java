package org.example.projava.chapterFour;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws IOException {

        // Create Socket instance and wait request from 1600 port
        var server = new ServerSocket(1700);
        System.out.println("Waiting...");

        // Accept client connection
//        Socket soc = server.accept();

        try (Socket soc = server.accept();
            // Prepare to Get data from socket
            InputStream input = soc.getInputStream();) {
            System.out.println("Connect from " + soc.getInetAddress());

            // Get the data
            System.out.println(input.read());
        }

        // Close connection when connecting client
//        input.close();
//        soc.close();
    }
}
