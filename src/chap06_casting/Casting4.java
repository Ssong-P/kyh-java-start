package chap06_casting;

public class Casting4 {
    public static void main(String[] args) {

        // 같은 타입의 계산 -> 같은 타입의 결과
        // 다른 타입의 계산 -> 큰 범위로 자동 형변환
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); // 1.5

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); // 1.5
    }
}
