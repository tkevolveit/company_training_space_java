package org.example.projava.chapterFour;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        try {
            var p = Path.of("test.txt");
            String s = Files.readString(p);
            System.out.println(s);
        } catch (NoSuchFileException e) {
//            throw new RuntimeException(e);
            System.out.println("No such file: " + e.getFile());
        }
    }
}
