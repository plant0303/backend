package a1113;

public class Ari3 {
    public static void main(String[] args) {
        int apple = 1;
        double totalPieves = apple * 10;
        int number = 7;
        double result = number * totalPieves;
        System.out.println("10조각에서 남은 양: " + result);
        System.out.println("사과 1개에서 남은 양: " + result / 10.0);
        // BigDecimal??
    }
}