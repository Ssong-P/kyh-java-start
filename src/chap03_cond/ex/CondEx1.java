package chap03_cond.ex;

public class CondEx1 {
    public static void main(String[] args) {
        int score = 60;
        String grade;

        if(score < 60) {
            grade = "F";
            System.out.println("학점은 F입니다.");
        } else if (score < 70) {
            grade = "D";
            System.out.println("학점은 D입니다.");
        } else if (score < 80) {
            grade = "C";
            System.out.println("학점은 C입니다.");
        } else if (score < 90) {
            grade = "B";
            System.out.println("학점은 B입니다.");
        } else if (score >= 90) {
            grade = "A";
            System.out.println("학점은 A입니다.");
        }
    }
}
