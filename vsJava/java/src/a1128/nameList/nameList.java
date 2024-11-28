package a1128.nameList;

import java.util.ArrayList;
import java.util.Scanner;

public class nameList {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        boolean roof = true;
        while (roof) {
            
            System.out.print("이름을 입력하세요> ");
            String name = sc.nextLine();
            
            if(name.equals("exit")){
                roof = false;
                break;
            }

            li.add(name);
        }

        System.out.print("찾는 사람의 이름을 입력하세요: ");
        String miss = sc.nextLine();
        for(int i = 0; i < li.size(); i++){
            if(li.contains(miss)){
                System.out.println("저장된 이름" + li);
                System.out.println(miss + "이 목록에 존재합니다.");
                break;
            } else{
                System.out.println(miss + "이 목록에 없습니다. ");
                break;
            }
        }

    }
}
