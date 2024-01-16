package chap_09_method;

public class MethodRef1 {
    public static void main(String[] args) {
        // 계산1
        int sum1 = add(1, 5); // 1, 5 : 인수
        System.out.println("결과1 출력: " + sum1);

        // 계산2
        int sum2 = add(10, 20);
        System.out.println("결과2 출력: " + sum2);

        // 반환값 받지 않는 경우 (메서드 실행만)
        add(100, 200);
    }

    // add 메서드
    public static int add(int a, int b) { // int a, int b : 매개변수(파라미터)
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
