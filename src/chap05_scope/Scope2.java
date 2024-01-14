package chap05_scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        for (int i = 0; i < 2; i++) { // 블록 내부, for문 내
            System.out.println("for m = " + m); // 블록 내부에서 외부 접근 가능
            System.out.println("for i + " + i);
        } // i 생존 종료
        System.out.println("-----------------");
        System.out.println("main m = " + m);
        //System.out.println("main i = " + i); // error : cannot find symbol
    } // m 생존 종료
}
