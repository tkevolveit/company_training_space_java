package org.example.projava.chapterFour;

public class RemoveDuplicate {
    public static void main(String[] args) {

        var data = "abcccbaabcc";

        char prev = 0;

        var builder = new StringBuilder();

        for (char ch : data.toCharArray()) {
            if (ch == prev) {
                continue;
            }
            builder.append(ch);
            prev = ch;
        }
        var result = builder.toString();

//        for (int i = 0; i < data.length(); i++) {
//            // Extract one character
//            char ch = data.charAt(i);
//
//            // Check duplicated character, if yes, loop again, no append
//            if (i > 0 && ch == data.charAt(i - 1)) {
//                continue;
//            }
//            builder.append(ch);
//        }

//        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
