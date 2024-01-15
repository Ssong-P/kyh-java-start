package chap08_array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        System.out.println("-----");

        // 향상된 for문 (for-each문)
        // 배열을 처음부터 끝까지 순회할 때 유용함
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("-----");

        // for-each문을 사용 불가
        // 증가하는 index값 필요한 경우
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number " + i + "번의 결과는: " + numbers[i]);
        }

    }
}
