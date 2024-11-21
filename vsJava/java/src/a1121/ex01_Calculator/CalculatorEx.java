package a1121.ex01_Calculator;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;
        double x = 10.25;
        double y = 5.4;
        int arr[] = {1, 2, 3, 4, 5};


        int plus = calculator.plus(a, b);
        int minus = calculator.minus(a, b);
        int multiply = calculator.multiply(a, b);
        double devide = calculator.devide(x, y);
        double remain = calculator.remain(x, y);
        int sum = calculator.sum(arr);
        double avg = calculator.avg(arr);

        System.out.println("더하기: " + plus);
        System.out.println("빼기: " + minus);
        System.out.println("곱하기: " + multiply);
        System.out.println("나누기: " + devide);
        System.out.println("나머지: " + remain);
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
