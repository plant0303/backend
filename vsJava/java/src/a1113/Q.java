package a1113;

import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세여: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세여: ");
        int num2 = sc.nextInt();

        System.out.printf("%d + %d = %d\n", num1, num2, (num1+num2));
        System.out.printf("%d - %d = %d\n", num1, num2, (num1-num2));
        System.out.printf("%d * %d = %d\n", num1, num2, (num1*num2));
        System.out.printf("%d / %d = %d\n", num1, num2, (num1/num2));
        System.out.printf("%d %% %d = %d\n", num1, num2, (num1%num2));

        // System.out.printf(num1 + " - " + num2 + " = " + (num1 - num2));
        // System.out.printf(num1 + " * " + num2 + " = " + (num1 * num2));
        // System.out.printf(num1 + " / " + num2 + " = " + (num1 / num2));
        // System.out.printf(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
