package a1112;

import java.util.Scanner;

public class Scan11 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력해: ");
        float text = sc.nextFloat();
        System.out.printf("출력문자열: %.2f", text);

    }
}
