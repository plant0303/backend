package a1118;

public class Array4 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};
        System.out.println("season[0]" + season[0]);
        System.out.println("season[1]" + season[1]);
        System.out.println("season[2]" + season[2]);
        System.out.println("season[3]" + season[3]);

        season[1] ="여름";
        System.out.println();
        System.out.println("season[1]" + season[1]);

        int[] scores = { 83, 90, 87 };
        int sum = 0;
        for(int i : scores){
            sum += i;
        }
        System.out.println("총 합: " + sum);
        System.out.println("평균: " + Math.ceil((double)sum / scores.length));
    }
}
