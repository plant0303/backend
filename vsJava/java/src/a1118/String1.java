package a1118;

public class String1 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";

        String d = new String("ㅎㅇㅎㅇ");
        String e = new String("자바자바");
        String f = new String("자바자바자바");

        System.out.println(a == c);
        System.out.println(e.equals((f)));
        System.out.println(b.equals((e)));
    }
}
