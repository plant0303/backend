package a1113;

public class Ari1 {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 3;
        byte v3 = 5;
        long v4 = 4L;

        int result1 = v1 + v2;
        System.out.println("result1" + result1);
        
        long result2 = v1 + v2 - v4;
        System.out.println("result2" + result2);

        double result3 = (double)v1 / v2;
        System.out.println("result3" + result3);

        int result4 = v1 % v2;
        System.out.println("result3" + result3);
    }
}
