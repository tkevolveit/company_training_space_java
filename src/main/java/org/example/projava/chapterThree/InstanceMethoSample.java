package org.example.projava.chapterThree;

public class InstanceMethoSample {
    record Student(String name, int englishScore, int mathScore) {
        int average() {
            return (this.englishScore() + this.mathScore()) / 2;
        }

        void showResult() {
            System.out.println(name + "'s average score is " + average());
        }

        public int maxScore() {
           return Math.max(englishScore(), maxScore());
        }
    }

    public static void main(String[] args) {
        var kis = new Student("kis", 60, 80);
//        var a = average(kis);
        var a = kis.average();
        kis.showResult();
        System.out.println("Average score is %d ".formatted(a));

        int max = kis.maxScore();
        System.out.println("Max score is %d".formatted(max));
    }

//    static int average(student s) {
//        return (s.englishscore() + s.mathscore()) / 2;
//    }
}
