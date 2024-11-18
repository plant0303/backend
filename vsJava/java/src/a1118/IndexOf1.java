package a1118;

public class IndexOf1 {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍");
        System.out.println("값: " + location);
        int substring = subject.indexOf(location);
        System.out.println(substring);

        location = subject.indexOf(location);
        if(location != -1){
            System.out.println("자바와 관련됨");
        } else{
            System.out.println("자바 관련 없음");
        }
    }
}
