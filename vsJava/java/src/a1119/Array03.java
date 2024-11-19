package a1119;

import java.util.Scanner;

public class Array03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("숫자 " + n + "개를 입력하세요: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        double avg = (double)sum / arr.length;
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
