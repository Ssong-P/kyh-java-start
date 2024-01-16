package chap_09_method.ex;

public class MethodExRef2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printMessage(5, message);
    }

    public static void printMessage(int x, String message) {
        for (int i = 0; i < x; i++) {
            System.out.println(message);
        }
    }
}
