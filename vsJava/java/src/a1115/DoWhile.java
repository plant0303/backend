package a1115;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("숫자입력해");
            number = sc.nextInt();
            System.out.println("입력한숫자" + number);
        } while (number != 0);
        System.out.println("프로그렘종료");
    }
}
