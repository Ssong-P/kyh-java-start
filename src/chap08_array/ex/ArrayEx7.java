package chap08_array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 점수를 입력하세요.");

            for (int j = 0; j < subject.length; j++) {
                System.out.print(subject[j] + " 점수: ");
                students[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int totalScore = 0;    // 계산 후 총점 초기화

            for (int j = 0; j < 3; j++) {
                totalScore += students[i][j];
            }

            double average = (double) totalScore / 3;
            System.out.println((i + 1) + "번 학생의 총점: " + totalScore + ", 평균: " + average);
        }
    }
}
