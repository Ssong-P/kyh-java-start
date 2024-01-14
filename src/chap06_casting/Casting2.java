package chap06_casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 : possible lossy conversion from double to int
        // 명시적 형변환
        intValue = (int) doubleValue;
        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);

        int z = (int) 10.5;
        System.out.println(z);
    }
}
