package a1120;

import java.util.Scanner;

public class Hak_Ex09 {
    public static void main(String[] args) {
        boolean run = true;

        int[] scores = null;
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int 학생수 = 0;
        while (run) {
            System.out.println("\n------------------------------------------------------");
            System.out.println("1.학생수  2.점수입력  3.점수리스트  4.분석  5.종료");
            System.out.println("------------------------------------------------------");
            System.out.print("선택> ");
            answer = sc.nextInt();
            int 점수 = 0;
            int sum = 0;
            int max = 0;
            double avg = 0;
            switch (answer) {
                case 1:
                    System.out.print("학생수> ");
                    학생수 = sc.nextInt();
                    scores = new int[학생수];
                    break;

                case 2:
                    if (scores == null) {
                        System.out.println("학생수부터 입력하고 와");
                        break;
                    }

                    System.out.print("점수> ");
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print(i + 1 + "번째 학생의 점수> ");
                        점수 = sc.nextInt();
                        scores[i] = 점수;
                    }
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println(scores[i]);
                    }
                    break;
                    
                case 3:
                    if (scores == null) {
                        System.out.println("학생수부터 입력하고 와");
                        break;
                    }
                    System.out.print("점수리스트> ");
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print(i + 1 + "번째 학생 " + scores[i] + "\t");
                    }
                    break;

                case 4:
                    if (scores == null) {
                        System.out.println("학생수부터 입력하고 와");
                        break;
                    }
                    for (int i : scores) {
                        sum += i;
                        max = max > i ? max : i;
                    }
                    avg = (double) sum / 학생수;
                    System.out.println("최고점수: " + max + "점");
                    System.out.println("총합: " + sum + "점");
                    System.out.println("평균: " + avg + "점");
                    break;

                case 5:
                    run = false;
                    break;

                default:
                    System.out.println("숫자가 잘못됨");
                    break;
            }
            
            try {
                
            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("학생수 입력해");
                
            }
        }
    }
}
