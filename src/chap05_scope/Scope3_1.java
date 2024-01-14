package chap05_scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        // 변수 temp는 if문 내에서만 사용
        // 임시 변수를 main() 블록 안에 선언할 경우 문제
        // 1. 비효율적인 메모리 사용
        // 2. 코드 복잡성 증가
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
