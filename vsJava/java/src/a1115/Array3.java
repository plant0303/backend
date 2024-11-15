package a1115;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuNo = 0;
        String item = "";
        List<String> li = new ArrayList<String>();

        while(menuNo != 4){
            System.out.println("=================================================");
            System.out.println("1.아이템추가    2.아이템삭제    3.카트확인  4.종료");
            System.out.println("=================================================");
            System.out.print("선택> ");
            menuNo = sc.nextInt();

            if(menuNo == 1){
                System.out.print("추가할 아이템> ");
                item = sc.next();
                li.add(item);
                System.out.println(item + "이 카트에 추가되었습니다.");
            } else if(menuNo == 2){
                System.out.print("삭제할 아이템> ");
                item = sc.next();
                li.remove(item);
                System.out.println(item + "이 카트에서 삭제되었습니다.");  
            } else if(menuNo == 3){
                System.out.print("현재 카트> ");
                for(int i = 0; i < li.size(); i++){
                    System.out.print(li.get(i) + " ");
                }
                System.out.println("");
            } else{
                System.out.println("다시");
            }

        }
    }
}
