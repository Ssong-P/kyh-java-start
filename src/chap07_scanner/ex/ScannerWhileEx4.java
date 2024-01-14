package chap07_scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPrice = 0;

        while (true) {

            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String prodName = input.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                int prodQuantity = input.nextInt();
                input.nextLine();

                int sum = price * prodQuantity;
                totalPrice += sum;

                System.out.println("상품명: " + prodName + ", 가격: " + price + ", 수량: " + prodQuantity + ", 합계 : " + sum);

            } else if (option == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 숫자를 입력해주세요.");
            }
        }
    }
}