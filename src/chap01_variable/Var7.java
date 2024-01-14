package chap01_variable;

public class Var7 {
    public static void main(String[] args) {
        // 변수 타입
        // [Type] + [Variable] = [literal];
        // 변수의 값은 변할 수 있지만, 리터럴은 변하지 않는다
        int a = 100; // 정수
        double b = 10.0; // 실수
        boolean c = true; // 불리언(boolean) : true, false 입력 가능
        char d = 'A'; // 문자 하나
        String e = "Hello Java"; // 문자열, 문자열을 다루기 위한 특별한 타입

        // 지정타입과 다른 변수 사용
        // int z = "100"; // compile error : incompatible types: java.lang.String cannot be converted to int

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
