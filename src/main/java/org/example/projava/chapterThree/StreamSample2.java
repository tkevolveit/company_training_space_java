package org.example.projava.chapterThree;

import java.util.List;

public class StreamSample2 {

    // 5文字以上のstringの個数を数える
    public static void main(String[] args) {
        var data = List.of("yamamoto", "kis", "sugiyama");

        // store the result
//        var result = 0;

        var result = (int) data
                .stream()
                .filter(s -> s.length() >= 5)
                .count();



        for (var s : data) {
            if (s.length() > 5) {
                result++;
            }
        }
        System.out.println(result);
    }
}
