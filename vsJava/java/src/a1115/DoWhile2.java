package a1115;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        int menuNo = 0;
        int 예금액 = 0;
        int 출금액 = 0;
        int 잔고 = 0;
        Scanner sc = new Scanner(System.in);
        while (menuNo != 4) {
            System.out.println("--------------------------------------");
            System.out.println("1. 예금     2.출금      3.잔고      4.종료");
            System.out.println("--------------------------------------");
            System.out.print("선택> ");
            menuNo = sc.nextInt();
            if(menuNo == 1){
                System.out.print("예금액> ");
                예금액 = sc.nextInt();
            } else if(menuNo == 2){
                System.out.print("출금액> ");
                출금액 = sc.nextInt();
            } else if(menuNo == 3){
                System.out.printf("잔고> %d\n", 예금액 - 출금액);
            }else{
                System.out.println("그런서비스없음");
            }
        }

    }
}
