package chap_09_method;

public class MethodValue3 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1 = " + num1);
        num1 = changeNumber(num1);
        System.out.println("changeNumber 호출 후, num1 = " + num1); // 10
    }

    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
//        System.out.println("2. changeNumber 변경 전, number = " + number); // 5
//        number = number * 2;
//        System.out.println("3. changeNumber 변경 후, number = " + number); // 10
    }
}
