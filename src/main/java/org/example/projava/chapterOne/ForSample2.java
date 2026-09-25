package org.example.projava.chapterOne;

public class ForSample2 {
    public static void main(String[] args) {

//        for (int i = 0; i < 5; i += 2) {
//            System.out.println(i);
//        }
//        for (int i = 3; i > 0; i--) {
//            System.out.println(i);
//        }

//        for (int i = 0; i < 36; i += 5) {
//            System.out.println(i);
//        }

//        for (int i = 20; i >= 0; i -= 3) {
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }

        // Check network
//        boolean isNetworkError = true;
//        do {
//            System.out.println("Check network");
//
//            if (isNetworkError) {
//                System.out.println("Check network again");
//                isNetworkError = false;
//            }
//        } while(isNetworkError);

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Skip");
                break;
            }
            System.out.println(i);
        }

//        for (int i = 0; i < 10; i++) {
//            if (i >= 3 && i <= 6) {
//                System.out.println("Skip");
//                continue;
//            }
////            if (i == 3 || i == 5) {
////                System.out.println("Skip");
////                continue;
////            }
//            System.out.println(i);
//        }

    }
}
