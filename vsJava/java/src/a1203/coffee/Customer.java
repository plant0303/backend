package a1203.coffee;

import java.util.Map;

public class Customer {
    private int orderNum;
    private int money;

    private Map<String, Integer> coffeeOrder;

    public Customer(Map<String, Integer> coffeeOrder) {
        this.coffeeOrder = coffeeOrder;
    }


    public Customer(int s) {
        this.orderNum = orderNum;
        this.money = 300000;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

}
