package chap04_loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        // for문의 조건식이 없을 경우 : 무한반복
        for(int i = 1; ; i++) {
            sum = sum + i;
            if(sum > 10) {
                System.out.println("i = " + i + ", sum = " + sum);
                break;
            }
        }
    }
}
