package a1119;

import java.util.Random;

public class Array04_1{
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i : numbers) {
            max = Math.max(max, i);
            max = Math.max(min, i);
        }
        System.out.println("최댓값: " + max);
        System.out.println("최댓값: " + min);
    }
}
