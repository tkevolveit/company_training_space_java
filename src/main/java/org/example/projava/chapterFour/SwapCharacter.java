package org.example.projava.chapterFour;

/**
 * i += 2 でループを回す: 2文字ペア（0番目と1番目、2番目と3番目...）で処理するため、
 * インデックスを2ずつ増やします。
 * i < chars.length - 1 の条件: 文字数が奇数（今回の "abcde" のように5文字）の場合、
 * 最後の「e」はペアになる相手がいないため、そのまま残るように安全にループを終了させます。
 */
public class SwapCharacter {
    public static void main(String[] args) {

        var data = "abcccbaabcc";

//        var data = "abcde"; // Output badce

        var sb = new StringBuilder(data);

        // Looping 1, 3, 5, 7, 9
        // data.length() - 1 -> IndexOutOfBoundを防ぐ
        for (int i = 0; i < data.length() - 1; i += 2) {
            int index1 = i;
            int index2 = i + 1;
            char tmp = sb.charAt(index1);
            sb.setCharAt(index1, sb.charAt(index2));
            sb.setCharAt(index2, tmp);
        }

        var result = sb.toString();

        System.out.println(data);
        System.out.println(result);
    }
}
