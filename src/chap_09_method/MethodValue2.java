package chap_09_method;

public class MethodValue2 {

    // MethodValue1에서 변수값 변경
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number = " + number); // 5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number = " + number); // 5
        // *** 자바는 값을 항상 복사해서 전달한다 ***
        // num2의 값이 변하더라도, num1의 값에는 전혀 영향을 미z\치지 못함
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number = " + number); // 5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number = " + number); // 10
    }
}
