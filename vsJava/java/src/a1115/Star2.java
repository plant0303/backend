package a1115;

import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("별 개수");
        int n = sc.nextInt();

        for(int  i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}