package a1113;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을입력해");
        int num = sc.nextInt();
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }
    }
}
