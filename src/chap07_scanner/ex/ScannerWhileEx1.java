package chap07_scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요(종료를 입력하면 종료) : ");
            String name = scanner.nextLine(); // line을 읽어옴

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt(); // 숫자만 읽어옴 -> 10\n에서 \n부분이 남게 됨 -> while으로 다시 실행됐을 때 nextLine()이 \n을 읽음
            scanner.nextLine(); // 남은 \n(line)을 읽어줌

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
