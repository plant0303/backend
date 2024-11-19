package a1119;

import java.util.Scanner;

public class Array04{
    public static void main(String[] args) {
        int[] arr = {4, 1, 8, -3, 6};
        
        int max = arr[0];
        int min = arr[0];
        for(int i : arr){
            if(max < i){
                max = i;
            }
            if(min > i){
                min = i;
            }
        }
        System.out.println();
        System.out.println("최대: " + max);
        System.out.println("최소: " + min);
        
    }
}
