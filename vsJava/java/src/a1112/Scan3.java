package a1112;

import java.util.Scanner;

public class Scan3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("이름: ");
        String name = sc.nextLine();
        System.out.println("나이입력");
        int age = sc.nextInt();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}
