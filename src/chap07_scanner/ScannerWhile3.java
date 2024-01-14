package chap07_scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요(0을 입력하면 종료): ");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("-- 입력 끝 --");
                break;
            }

            sum += num;
        }
        System.out.println("입력한 정수의 총합: " + sum);
    }
}
