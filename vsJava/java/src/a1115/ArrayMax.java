package a1115;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하셈: ");
        int N = sc.nextInt();

        System.out.println(N + "개의 정수를 입력하세요: ");
        int[] arr = new int[N];
        
        int max = 0;
        int min = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            min = arr[0];
            max = max < arr[i] ? arr[i] : max;
            min = min > arr[i] ? arr[i] : min;
        }
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

    }
}
