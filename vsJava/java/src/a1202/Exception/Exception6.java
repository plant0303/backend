package a1202.Exception;



public class Exception6 {
    public static void main(String[] args) {
        String[] names = {"kim", "Lee", "Park", "Choi"};

        try{
            System.out.printf("0번 인덱스 요소: %s\n", names[0]);
            System.out.printf("4번 인덱스 요소: %s\n", names[4]);
            System.out.printf("3번 인덱스 요소: %s\n", names[3]);
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("인덱스 접근이 잘못되었습니다.");
        } finally{
            System.out.println("finally문은 예외 발생과 상관 없이 항상 수행됨");
        }
    }
}
