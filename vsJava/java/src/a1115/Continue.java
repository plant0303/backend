package a1115;

import java.util.Scanner;

public class Continue {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int n = sc.nextInt();
            if(n < 0){
                continue;
            }
            sum += n;
        }
        System.out.println(sum);

    }
}
