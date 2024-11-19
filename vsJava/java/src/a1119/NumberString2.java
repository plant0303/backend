package a1119;

import java.util.Scanner;

public class NumberString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int number = sc.nextInt();
     
        int m50000  = number / 50000;
        int m10000  = (number % 50000) / 10000;
        int m5000   = ((number % 50000) % 10000)/5000;
        int m1000   = (((number % 50000) % 10000 ) % 5000) / 1000;
        int m500    = ((((number % 50000) % 10000 ) % 5000) % 1000) / 500;
        int m100    = (((((number % 50000) % 10000 ) % 5000) % 1000) % 500) / 100;
        int m10     = ((((((number % 50000) % 10000 ) % 5000) % 1000) % 500) % 100) / 10;
        int m5      = (((((((number % 50000) % 10000 ) % 5000) % 1000) % 500) % 100) % 10) / 5;
        int m1      = ((((((((number % 50000) % 10000 ) % 5000) % 1000) % 500) % 100) % 10) % 5) /1;

        System.out.println("오만원권: " + m50000    + "매");
        System.out.println("만원권: "   + m10000    + "매");
        System.out.println("오천원권: " + m5000     + "매");
        System.out.println("천원권: "   + m1000     + "매");
        System.out.println("오백원: "   + m500      + "개");
        System.out.println("백원: "     + m100      + "개");
        System.out.println("십원: "     + m10       + "개");
        System.out.println("오원: "     + m5        + "개");
        System.out.println("일원: "     + m1        + "개");


    }
}
