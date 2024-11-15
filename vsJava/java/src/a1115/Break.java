package a1115;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("입력!: ");
            String str = sc.nextLine();
            if(str.equals("q")){
                break;
            }
            System.out.println("입력받은문자느은: " + str);
        }
        System.out.println("프로그램종료");
        sc.close();
    }
}
