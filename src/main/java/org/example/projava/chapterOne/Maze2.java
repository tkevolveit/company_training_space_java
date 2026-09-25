package org.example.projava.chapterOne;

import java.io.IOException;

public class Maze2 {

    /*
    * Design
    * Goal is right top corner
    * Start position is bottom left corner
    * Move key: hjkl
    * Goal  landmark is G
    * position change o to O
    * Display only 5 x 5
    *    *...G
    *    **..*
         *...*
         *...*
         o...*
    * */
    public static void main(String[] args) throws IOException {

        record Position(int x, int y) {};
        int[][] mapMaze = {
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {1, 1, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 1, 1, 1},
        };

        var current = new Position(0,5);
        var GOAL = new Position(4,0);
        boolean isGoal = false;

        while(!isGoal) {

            // Map maze
            for (int y = 0; y < mapMaze.length; y++) {

                for (int x = 0; x < mapMaze[y].length; x++) {

                    if (x == current.x() && y == current.y()) {
                        System.out.print("o");
                    } else if (x == GOAL.x() && y == GOAL.y()) {
                        System.out.print("G");
                    } else if (mapMaze[y][x] == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }

            if (current.equals(GOAL)) {
                System.out.println("GOAL!");
                isGoal = true;
    //            break;
            }

            int key = System.in.read();
            System.out.println(key);

            var move = switch (key) {
                case 'h' -> new Position(current.x() -1, current.y());
                case 'j' -> new Position(current.x(), current.y()+1);
                case 'k' -> new Position(current.x(), current.y()-1);
                case 'l' -> new Position(current.x() +1, current.y());
                default -> current;
            };

            if (mapMaze[move.y()][move.x()] == 0) {
                current = move;
            }

            System.in.read();
        }
    }
}
