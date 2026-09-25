package org.example.projava.chapterFour;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WebClient2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Get HttpClient object
        HttpClient client = HttpClient.newHttpClient();

        // HttpReqest
        URI uri = URI.create("https://example.com");
        HttpRequest req = HttpRequest.newBuilder(uri).build();

        // Responseの処理内容
        HttpResponse<String> response = client.send(
                req, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        body.lines()
                .limit(5)
                .forEach(System.out::println);

    }
}
