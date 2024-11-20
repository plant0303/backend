package a1120.class1;

public class StudentEx {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "이름이름";
        st1.age = 1;
        st1.studentId = "20100311";

        Student st2 = new Student();
        st2.name = "이름이름이름";
        st2.age = 2;
        st2.studentId = "20011228";

        System.out.println("이름: " + st1.name);
        System.out.println("나이: " + st1.age);
        System.out.println("학번: " + st1.studentId);
        
        System.out.println("이름: " + st2.name);
        System.out.println("나이: " + st2.age);
        System.out.println("학번: " + st2.studentId);
    }
}
