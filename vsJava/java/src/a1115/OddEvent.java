package a1115;

public class OddEvent {
    public static void main(String[] args) {
        int oddNum = 0;
        int evenNum = 0;
        int i = 1;
        while(i <= 20){
            if(i % 2 == 0){
                evenNum += i;
            }else{
                oddNum += i;
            }
            i++;
        }
        System.out.printf("짝수: %d, 홀수: %d", evenNum, oddNum);
    }
}
