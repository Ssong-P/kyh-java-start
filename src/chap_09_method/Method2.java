package chap_09_method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램 동작");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        // 모든 메서드는 반환값을 가진다
        return; // void의 경우 생략 가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
