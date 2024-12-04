package a1204.ramda;

interface Calculator3{
    int sum(int a, int b);

}

public class Function3 {
    public static void main(String[] args) {
        // 람다식, 구현 클래스가 필요 없다
        Calculator3 mc = Integer::sum;
        int result = mc.sum(3, 4);
        System.out.println(result);

    }
}
