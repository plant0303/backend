package a1203.coffee;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeService {
    private boolean reOrder = false; // 고객의 추가주문 여부
    private int orderNum = 1;

    public CoffeeService() {
        orderList = new LinkedHashMap<>();
    } // orderList : 고객주문 저장
      // LinkedHashMap<>()
      // 입력순서또는 접근순서 보장, 속도 :약간느림, 용도: 순서가중요한경우

    // 커피 객체 준비
    Coffee coffee = Coffee.getInstance(); // 커피메뉴 관리하는 싱글톤객체
    // 손님
    Customer customer;
    // 지연클래스 준비
    Thread t = new Thread(); // 아직 안배움
    Map<String, Integer> orderList;
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("\n 어서오세요 연세IT커피숍입니다.");
        customer = new Customer(orderNum);
        coffee.getMenu(); // 메뉴판
        order();

    }

    private void order() {
        System.out.println("취소를 원하시면 0을 눌러주세요");
        end:while(true){
            System.out.println("원하시는 음료의 번호를 선택해주세요");
            String choice = sc.next();
            int choiceNum = Integer.parseInt(choice.substring(0, 1));
            if(choiceNum == 0){
                System.out.println("주문을 취소합니다");
                System.out.println(0);
            }
            sc.nextInt();
            String coffeeName = coffee.coffeeList.get(choiceNum - 1);
            System.out.println("선택하신 음료는: " + coffeeName + "입니다. 몇 잔 주문하시겠습니까?");
            int orderCount = sc.nextInt();
            sc.nextLine();
            if(reOrder){
                for(String coff:orderList.keySet()){
                    int addCount = orderList.get(coff).intValue() + orderCount;
                }
            }
        }
    }

}
