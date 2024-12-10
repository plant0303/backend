package a1210;

import java.util.Scanner;

public class Castion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("넓이 계산을 원하는 도형 유형을 선택해주세요");
        System.out.println("1. 원형\t 2. 사각형\t 3. 삼각형");
        int shape = sc.nextInt();
        Shape shapeObject = new Shape("");
    }
}

class Shape{
    private String render;
    public Shape(String render){
        this.render = render;
    }

    public double calculateArea(double radius){
        this.render = "circle";
        return Math.PI * Math.pow(radius, 2);
    }

}