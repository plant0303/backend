package a1122.Student;

public class StudentEx {
    public static void main(String[] args) {
        Student std1 = new Student("홍길동", 20231234, 90, 85, 92);
        Student std2 = new Student("제갈길동", 20231235, 100, 5, 30);
        
        std1.setKoScore(50);

        System.out.println(std1.toStr());
        System.out.println(std2.toStr());


    }

}
