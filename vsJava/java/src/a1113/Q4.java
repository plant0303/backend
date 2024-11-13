package a1113;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력해: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.printf("1부터 100까지의 합은 %d 입니다", sum);
    }
}
