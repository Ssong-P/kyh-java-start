package chap08_array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int count = scanner.nextInt();
        int[][] students = new int[3][count];
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + " 점수: ");
                students[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int totalScore = 0;
            for (int j = 0; j < 3; j++) {
                totalScore += students[i][j];
            }
            double average = (double) totalScore / subject.length;
            System.out.println((i + 1) + "번 학생의 총점: " + totalScore + ", 평균: " + average);
        }
    }
}
