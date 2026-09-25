package org.example.projava.chapterThree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample1 {

    public static void main(String[] args) {
        var data = List.of("yamamoto", "kis", "sugiyama");

        // store the result
//        var result = new ArrayList<String>();

        var result = data
                .stream()
                .filter(s -> s.length() >= 5)
                .collect(Collectors.toCollection(ArrayList::new));

        for (var s : data) {
            if (s.length() > 5) {
                result.add(s);
            }
        }
        System.out.println(result);
    }
}
