package a1202.Exception;

public class Exception2 {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.length());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("널 참조 발생" + e.getMessage());
        }
    }    
}
