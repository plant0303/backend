package a1204.ramda;

interface Calculator2{
    int sum(int a, int b);

}

public class Function2 {
    public static void main(String[] args) {
        // 람다식, 구현 클래스가 필요 없다
        Calculator2 mc = (int a, int b) -> a + b;
        int result = mc.sum(3, 4);
        System.out.println(result);

    }
}
