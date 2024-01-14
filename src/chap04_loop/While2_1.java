package chap04_loop;

public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;

//        sum = sum + 1;
//        System.out.println("i = " + 1 + ", sum = " + sum);
//        sum = sum + 2;
//        System.out.println("i = " + 2 + ", sum = " + sum);
//        sum = sum + 3;
//        System.out.println("i = " + 3 + ", sum = " + sum);

        // 변수 i 사용
        int i = 1;

        sum = sum + i;
        System.out.println("i = " + i + ", sum = " + sum);
        i++;
        sum = sum + i;
        System.out.println("i = " + i + ", sum = " + sum);
        i++;
        sum = sum + i;
        System.out.println("i = " + i + ", sum = " + sum);
        i++;

    }
}
