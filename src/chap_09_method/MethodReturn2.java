package chap_09_method;

public class MethodReturn2 {
    public static void main(String[] args) {
        chechAge(20);
    }

    public static void chechAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return; // 메서드를 빠져나감
        }
        System.out.println(age + "살, 입장하세요.");
    }
}
