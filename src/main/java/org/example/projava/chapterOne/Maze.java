package org.example.projava.chapterOne;

import java.io.IOException;

public class Maze {
    public static void main(String[] args) throws IOException {

        record Position(int x, int y) {}
        // maze blueprint
        int[][] map = {
                {1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}
        };
        var current = new Position(1, 1);
        var goal = new Position(4, 3);

        // 条件していなしのループ
        for (;;) {
            // display maze
            for (int y = 0; y < map.length; y++) {
                // length equal map's element, 6 elements
                for (int x = 0; x < map[y].length; x++) {
                    // current position
                    if (x == current.x() && y == current.y()) {
                        System.out.print("o");
                    } else if (map[y][x] == 1) {
                        System.out.print("*");  //  * means wall
                    } else {
                        System.out.print(".");  // . means alley
                    }
                }
                System.out.println();
            }
            // goal
            if (current.equals(goal)) {
                System.out.println("GOAL!!");
                break;
            }
            // Input entry
            int ch = System.in.read();

            // Get direction
            var next = switch (ch) {
                case 'a' -> new Position(current.x()-1, current.y());
                case 'w' -> new Position(current.x(), current.y()-1);
                case 's' -> new Position(current.x()+1, current.y());
                case 'z' -> new Position(current.x(), current.y()+1);
                default -> current;
            };
            // Move direction if data is 0 by typed a, w, s, z
            if (map[next.y()][next.x()] == 0) {
                current = next;
            }
            // Enterの入力を捨てる
            System.in.read();
        }
    }
}
