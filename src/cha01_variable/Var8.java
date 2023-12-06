package cha01_variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)
        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        // 실수
        float f = 10.0f;
        double d = 10.0; // double이 float보다 넓은 범위를 가짐

        // 리터럴 타입
        // int ii = 2147483648; // compile error : integer number too large
        long ll = 2147483648L;
    }
}
