package chap02_operator;

public class OperatorAssign1 {
    public static void main(String[] args) {

        // 대입 연산자
        int a = 5;

        a += 3; // 5 + 3 = 8 : a = a + 3
        System.out.println("a = " + a);

        a -= 2; // 8 - 2 = 6 : a = a -2
        System.out.println("a = " + a);

        a *= 4; // 6 * 4 = 24 : a = a * 4
        System.out.println("a = " + a);

        a /= 3; // 24 / 3 = 8 : a = a / 3
        System.out.println("a = " + a);

        a %= 5; // 8 % 5 = 3 : a = a % 5
        System.out.println("a = " + a);
    }
}
