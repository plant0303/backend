package a1118;

public class Array2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {83, 90, 87};
        int sum = 0;
        for(int i : scores){
            sum += i;
        }
        System.out.println("총 합: " + sum);

        printItem(new int[] {83, 90, 87});
    }
    public static void printItem(int[] scores){
        for(int i = 0; i < 3; i++){
            System.out.println(scores[i]);
        }
    }

}
