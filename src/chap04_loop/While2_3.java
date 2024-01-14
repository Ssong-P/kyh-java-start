package chap04_loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        // i의 scope 범위가 넓음
        int i = 1;
        int endNum = 10;

        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i = " + i + ", sum = " + sum);
            i++;
        }

    }
}
