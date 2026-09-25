package org.example.projava.chapterFour;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class WebClient {
    public static void main(String[] args) throws IOException {

//        var domain = "example.com";

        var domain = "www.google.com";

        // SSL通信のSocket Objectを生成
        SocketFactory factory = SSLSocketFactory.getDefault();

        // 80: http, 443: https
        try (var soc = new Socket(domain, 443);
             // For output
             var pw = new PrintWriter(soc.getOutputStream());
             // For input
             var isr = new InputStreamReader(soc.getInputStream());
             var bur = new BufferedReader(isr)) {

            // Receive pw to write a line by line (１行づつ出力)
            pw.println("GET /index.html HTTP/1.1");

            // Domain の指定
            pw.println("Host: " + domain);

            // Empty means end response
            pw.println();
            // Forcibly to send data
            pw.flush();

            // one line output
            bur.lines()
                    .limit(18)
                    .forEach(System.out::println);
        }
    }
}
