package chap02_operator;

public class Operator4 {
    public static void main(String[] args) {
        // 연산자 우선순위
        int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); // sum3과 같다
        // 괄호를 명시적으로 사용하는 것이 명확함
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
