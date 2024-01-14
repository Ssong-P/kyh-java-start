package chap04_loop.ex;

public class LoopEx5 {
    public static void main(String[] args) {

        // 문제 풀이
//        System.out.print("*");
//        System.out.println();
//
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();
//
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.println();

        // 피라미드
        int row = 3;

        for(int i = 1; i <= row; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
