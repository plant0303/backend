package a1113;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을입력해");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        double result = ((num1 + num2 + num3) / 3);
        
        System.out.println(num1 + num2 + num3);
        System.out.printf("%.1f\n", result);
    }
}
