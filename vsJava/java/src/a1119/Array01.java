package a1119;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
            sum += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("모든 요소의 합: "+sum);

    }
}
