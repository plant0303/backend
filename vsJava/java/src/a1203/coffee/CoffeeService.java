package a1203.coffee;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeService {
    private boolean reOrder = false; // 고객의 추가주문 여부
    private int orderNum = 1; // 고객주문번호

    private Coffee coffee = Coffee.getInstance(); // 커피메뉴 관리하는 싱글톤 객체
    private Customer customer; // 고객 객체
    private Map<String, Integer> orderList; // 고객의 주문 목록
    private Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체

    // 주문 서비스 시작
    public void start() {
        System.out.println("\n 어서오세요 연세IT커피숍입니다.");
        initializeCustomer(); // 고객 초기화
        coffee.getMenu(); // 메뉴 출력
        processOrder(); // 주문 받기
        printTotalOrder(); // 주문 내역 출력
        processPayment(); // 결제 처리
    }

    // 고객 객체 초기화
    private void initializeCustomer() {
        customer = new Customer(orderNum); // 주문번호와 잔액 초기화(인스턴스 생성)
    }

    // 주문 받기
    private void processOrder() {
        while (true) {
            System.out.println("\n 취소를 원하시면 0번을 눌러주세요");
            try {
                String coffeeName = getOrderChoice(); // 커피 주문 받기
                int orderCount = getOrderQuantity(coffeeName); // 주문 수량 받기

                updateOrderList(coffeeName, orderCount); // 주문 목록 갱신
                customer.setCoffeeOrder(orderList); // 고객 주문 저장

                if (!askForAdditionalOrder()) {
                    break; // 추가 주문을 하지 않으면 종료
                }
            } catch (Exception e) {
                System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
            }
        }
    }

    // 커피 메뉴에서 선택한 음료 이름을 반환
    private String getOrderChoice() {
        System.out.print("\n원하는 음료의 번호를 선택해주세요: ");
        String choice = sc.next();
        int choiceNum = Integer.parseInt(choice.substring(0, 1)); // 첫 번째 숫자만 추출

        if (choiceNum == 0) {
            System.out.println("주문을 취소합니다.");
            System.exit(0); // 주문 취소
        }

        sc.nextLine(); // 불필요한 개행 문자 처리
        return coffee.coffeeList.get(choiceNum - 1); // 커피 이름 반환
    }

    // 커피의 주문 수량을 받음
    private int getOrderQuantity(String coffeeName) {
        System.out.println("선택하신 음료는 " + coffeeName + "입니다. 몇 잔 주문하시겠습니까?");
        int orderCount = sc.nextInt();
        sc.nextLine(); // 불필요한 개행 문자 처리
        return orderCount;
    }

    // 주문 목록을 업데이트
    private void updateOrderList(String coffeeName, int orderCount) {
        if (reOrder) {
            // 이미 주문한 커피가 있으면 수량을 추가
            for (String coffee : orderList.keySet()) {
                if (coffee.equals(coffeeName)) {
                    int updatedCount = orderList.get(coffee) + orderCount;
                    orderList.replace(coffee, updatedCount);
                    return;
                }
            }
        }
        // 새로운 커피 주문 추가
        orderList.put(coffeeName, orderCount);
    }

    // 추가 주문을 할지 여부를 묻는 메소드
    private boolean askForAdditionalOrder() {
        System.out.println("\n주문을 계속하시겠습니까? (예(Y) / 아니요(N))");
        String response = sc.next();
        if (response.equalsIgnoreCase("Y")) {
            coffee.getMenu(); // 메뉴 다시 출력
            reOrder = true;
            return true;
        } else if (response.equalsIgnoreCase("N")) {
            return false;
        }
        return false;
    }

    // 주문 내역 출력
    private void printTotalOrder() {
        int totalAmount = 0;
        int coffeePrice;
        DecimalFormat formatter = new DecimalFormat("###,000원");
        StringBuffer message = new StringBuffer();

        message.append("\n\n +----------------------------------------------------+\n")
               .append("|                    주문 내역                    |\n")
               .append("+----------------------------------------------------+ \n")
               .append("| 고객: ").append(customer.getOrderName()).append(" 님\n");

        int s = 1;
        for (Map.Entry<String, Integer> order : customer.getCoffeeOrder().entrySet()) {
            coffeePrice = coffee.menu.get(order.getKey()) * order.getValue();
            totalAmount += coffeePrice;
            String formattedPrice = formatter.format(coffeePrice);
            message.append(String.format(" | [%d] %-20s : %2d잔  %7s |\n", s, order.getKey(), order.getValue(), formattedPrice));
            s++;
        }

        message.append("+----------------------------------------------------+\n")
               .append(" ============ 총 결제 금액은 ").append(formatter.format(totalAmount)).append("입니다 ========== \n");

        System.out.println(message);
    }

    // 결제 처리
    private void processPayment() {
        int totalAmount = calculateTotalAmount();
        System.out.println("\n 결제 진행 중...");
        try {
            Thread.sleep(2500); // 결제 대기 시간
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (customer.getMoney() < totalAmount) {
            System.out.println("잔액이 부족합니다. 확인 후 다시 주문해주세요.");
            System.exit(0); // 잔액 부족 시 종료
        } else {
            customer.setMoney(customer.getMoney() - totalAmount); // 결제 후 잔액 갱신
            System.out.println("결제가 완료되었습니다. 이용해주셔서 감사합니다.");
            orderNum++; // 다음 고객 번호로 증가
        }
    }

    // 총 결제 금액 계산
    private int calculateTotalAmount() {
        int totalAmount = 0;
        for (Map.Entry<String, Integer> order : customer.getCoffeeOrder().entrySet()) {
            int price = coffee.menu.get(order.getKey()) * order.getValue();
            totalAmount += price;
        }
        return totalAmount;
    }

    // 생성자
    public CoffeeService() {
        orderList = new LinkedHashMap<>();
    }
}
