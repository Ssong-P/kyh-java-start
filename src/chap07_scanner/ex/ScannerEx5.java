package chap07_scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = input.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수 : ");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) { // i가 마지막 값이 아니면 , 출력
                System.out.print(", ");
            }
        }
    }
}
