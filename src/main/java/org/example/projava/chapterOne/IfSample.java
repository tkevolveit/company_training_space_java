package org.example.projava.chapterOne;

public class IfSample {

    public static void main(String[] args) {
        var a = 2;
        a = 4;
        if (a < 3) {
            System.out.println("small");
        } else if (a < 7) {
            System.out.println("mid");
        } else {
            System.out.println("large");
        }
    }
}
