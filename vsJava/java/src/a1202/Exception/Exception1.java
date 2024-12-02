package a1202.Exception;

public class Exception1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try{
            System.out.println(numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스 범위 초과" + e.getMessage());
        }
    }    
}
