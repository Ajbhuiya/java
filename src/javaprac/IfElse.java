package javaprac;

public class IfElse {

    public static void main(String[] args) {

        int score = 70;
        String grade;

        if (score > 90) {
            grade = "A";
        } else if (score < 80) {
            grade = "B";
        } else if (score < 70) {
            grade = "C";
        } else if (score < 60) {
            grade = "D";
        } else {
            grade="F";

        }
        System.out.println("grade is " + grade);
    }
    }















/*

 */
/*        sum();
        int score = 80;
        String grade;

        if (score == 80) {
            grade = "A";
        } else if (score < 80) {
            grade = "B";
        } else {
            grade = "c";
        }
        System.out.println("grade is " + grade);
        System.out.println("score is " + score);
    }

    public static void sum() {
        int time = 8;
        if (time < 8) {
            System.out.println("its day");
        } else if (time > 8) {
            System.out.println("its night");
        } else if (time > 10) {
            System.out.println("its good night");
        } else {
            System.out.println("its no time");

        }*//*

    }
}
*/
