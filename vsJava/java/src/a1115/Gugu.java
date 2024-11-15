package a1115;

import java.util.Scanner;

public class Gugu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int x = sc.nextInt();
        for(int i = 1; i <= 9; i++){
            System.out.printf("%x * %d = %d\n", x, i, x*i );
        }
        sc.close();
    }
}
