package org.example.projava.chapterFour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    public static void main(String[] args) throws IOException {

        var server = new ServerSocket(8880);
        for (;;) {

            // Socketの準備
            try (Socket soc = server.accept();
                 // Manage connection
                 var isr = new InputStreamReader(soc.getInputStream());
                 var bur = new BufferedReader(isr);
                 var w = new PrintWriter(soc.getOutputStream())) {

                System.out.println("Connected from " + soc.getInetAddress());

                // out the line until the empty
                bur.lines()
                        .takeWhile(line -> !line.isEmpty())
                        .forEach(System.out::println);

                // Send response message
                w.println("""
                        HTTP/1.1 200 ok
                        Content-Type: text/plain
                        
                       <html><head><title>Hello</title></head>
                       <body><h1>Hello</h1>It works!</body></html>
                        """);
            }
        }
    }
}
