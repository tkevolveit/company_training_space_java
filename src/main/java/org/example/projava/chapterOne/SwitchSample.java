package org.example.projava.chapterOne;

public class SwitchSample {

    public static void main(String[] args) {
        var a = 3;

        switch (a) {
            case 1, 2 -> System.out.println("one-two");
            case 3 -> System.out.println("three");
            case 5 -> System.out.println("five");
            default -> System.out.println("four");
        }
    }
}
