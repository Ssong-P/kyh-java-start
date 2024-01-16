package chap_09_method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1 = " + num1); // 5
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1 = " + num1); // 5
        // *** 자바는 값을 항상 복사해서 전달한다 ***
        // num2의 값이 변하더라도, num1의 값에는 전혀 영향을 미치지 못함
    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2 = " + num2); // 5
        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2 = " + num2); // 10
    }
}
