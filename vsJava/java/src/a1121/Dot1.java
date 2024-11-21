package a1121;

public class Dot1 {
    public static void main(String[] args) {
        printNumbers(1, 2, 3);
        printNumbers(10, 20);
    }

    private static void printNumbers(int... numbers) {
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
