package chap08_array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int minNumber, maxNumber;

        System.out.println(size + "개의 정수를 입력하세요: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);

        // 크기 순으로 정렬
//        for (int j = 0; j < size - 1; j++) {
//            if (numbers[j] > numbers[j + 1]) {
//                int temp = numbers[j];
//                numbers[j] = numbers[j + 1];
//                numbers[j + 1] = temp;
//            }
//            if(numbers[0] > numbers[size-1]) {
//                int temp = numbers[0];
//                numbers[0] = numbers[size-1];
//                numbers[size-1] = temp;
//            }
//        }
//
//        System.out.println("가장 작은 정수: " + numbers[0]);
//        System.out.println("가장 큰 정수: " + numbers[numbers.length-1]);
    }
}
