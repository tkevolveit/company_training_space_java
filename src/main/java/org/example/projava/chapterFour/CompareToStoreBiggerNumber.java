package org.example.projava.chapterFour;


import java.util.ArrayList;
import java.util.Arrays;

public class CompareToStoreBiggerNumber {
    public static void main(String[] args) {

        int[] data = {3, 6, 9, 4, 2, 1, 5};

        ArrayList<Integer> storeBiggerNum = new ArrayList<>();

        // data.length() - 1 -> IndexOutOfBoundを防ぐ
        for (int i = 0; i < data.length - 1; i++) {
            int idx1 = i;
            int idx2 = i + 1;
            int biggerNum = Math.max(data[idx1], data[idx2]);
            System.out.println(biggerNum);
            storeBiggerNum.add(biggerNum);
        }

//        int[] result = storeBiggerNum.stream().mapToInt(i -> i).toArray();
        /**
         * Convert the List<String> to Stream<String> using the stream() method.
         * Convert Stream<String> to Stream<Integer> using mapToInt() method.
         * Convert Stream<Integer> to int array using toArray() method.
         */
        int[] result = storeBiggerNum.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(data);
        System.out.println(result);
        System.out.println(storeBiggerNum);

        for (int i : result) {
            System.out.print(i);
        }
    }
}
