package a1121.Rectangle;

import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rec1 = new Rectangle();
        System.out.println("사각형의 가로와 세로 길이를 입력하세요.");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        double area = rec1.getArea(width, height);
        double permieter = rec1.getPerimeter(width, height);

        System.out.println("면적: " + area + "㎡");
        System.out.println("둘레: " + permieter + "cm");


        Rectangle rec2 = new Rectangle();
        System.out.println("정사각형의 가로 길이를 입력하세요: ");
        double width2 = sc.nextDouble();
        rec2.setDimensions(width2);
        System.out.println("정사각형 면적: " + rec2.getArea(width2));
        System.out.println("정사각형 둘레: " + rec2.getPerimeter(width2));
    }
}
