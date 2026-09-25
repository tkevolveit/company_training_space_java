package org.example.projava.chapterThree;

import java.util.List;

public class ForEachListSample {

    public static void main(String[] args) {

//        var strs = List.of("apple", "banana", "grape");
//
//        for (String str : strs) {
//            System.out.println(str);
//        }

        var names = List.of("yusuke", "kis", "sugiyama");

//        for (int i = 0; i < names.size(); i++) {
//            var name = names.get(i);
//            System.out.println(name);
//        }

        for (var name : names) {
            System.out.println(name);
        }
    }
}
