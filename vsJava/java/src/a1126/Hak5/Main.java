package a1126.Hak5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름: ");
        String name = sc.nextLine();

        System.out.println("학번: ");
        String stdId = sc.nextLine();

        System.out.println("성적: ");
        int score = sc.nextInt(0);

        // Grade 객체 생성
        Grade grade = new Grade(name, stdId, score);
        System.out.println(grade.toString());

        sc.close();

    }
}
