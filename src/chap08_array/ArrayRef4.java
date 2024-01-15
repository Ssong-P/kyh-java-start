package chap08_array;

public class ArrayRef4 {
    public static void main(String[] args) {

        // int[] students; // 배열 변수 선언
        // students = new int[5]; // 배열 생성
        int[] students = {90, 80, 70, 60, 50}; // 배열 생성과 초기화 : 한줄에 쓸때만 허용

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
