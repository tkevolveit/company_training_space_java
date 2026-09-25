package org.example.projava.chapterThree;

import java.util.ArrayList;
import java.util.List;

public class StreamSample3 {

    // 5文字以上のstringの個数を数える
    public static void main(String[] args) {
        var strs = List.of("apple", "banana", "grape");

        // store the result
        var result = 0;

        var result2 = new ArrayList<String>();

        for (String str : strs) {

            if (str.length() == 5) {
                result2.add(str);
                result++;
            }
        }

        for (String s : result2) {

            if (s.contains("p")) {
                System.out.println(s + "result contains P");
            }
        }

        // Check the result of work all matches "p"
        boolean allContainsP = result2.stream().allMatch(s -> s.contains("p"));

        System.out.println(result2 + "contain P?: " + allContainsP);
        System.out.println("letter is 5 :" + result2);
        System.out.println(result);


    }
}
