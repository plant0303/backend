package a1118;

public class Char1 {
    public static void main(String[] args) {
        String ssn = "7310182328213";
        char sex = ssn.charAt(6);
        int len = ssn.length();
        switch (sex) {
            case '1': System.out.println("여자"); break;
            case '2': System.out.println("남자"); break;
            default:  System.out.println("숫자가잘못됨"); break;
        }
    }
}
