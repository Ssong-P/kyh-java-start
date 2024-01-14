package chap04_loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // for문의 조건식이 없을 경우 : 무한반복
        for(;;) {
            sum = sum + i;
            if(sum > 10) {
                System.out.println("i = " + i + ", sum = " + sum);
                break;
            }
            i++;
        }
    }
}
