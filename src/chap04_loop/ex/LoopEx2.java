package chap04_loop.ex;

public class LoopEx2 {
    public static void main(String[] args) {
//        int num = 2;
//        int count = 1;
//
//        while (count <= 10) {
//            System.out.println(num);
//            num += 2;
//            count++;
//        }

//        // 이런 방법도 있음
//        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
//            System.out.println(num);
//        }

        // 추천코드
        int num = 2;
        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }
    }
}
