package org.example.projava.chapterOne;

public class KakezanTable {

    public static void main(String[] args) {

//        String[] word = { "a", "b", "c" };
//
//        for (int i = 0; i <= 2; i++) {
//
//            for (int j = 0; j <= 2; j++) {
//                // %2d means align right, %-2d is align left
//                System.out.printf(word[i] + word[j].toUpperCase() + " | ");
//            }
//            System.out.println();
//        }

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
