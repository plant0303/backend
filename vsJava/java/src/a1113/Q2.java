package a1113;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를입력하세용");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.printf("%d는 짝수", num);
        } else{
            System.out.printf("%d는 홀수", num);
        }
    }
}
