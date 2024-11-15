package a1115;

import java.util.Scanner;

public class GuguAll {
    public static void main(String[] args) {
        for(int dan = 1; dan <= 9; dan++){
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d*%d=%d  ", j, dan, dan*j);
            }
            System.out.println("");
        }
    }
}
