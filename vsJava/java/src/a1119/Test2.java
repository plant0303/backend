package a1119;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];
        for(int i : array){
            max = i > max ? i : max;
        }
        System.out.println("최대값: " + max);
    }
}
