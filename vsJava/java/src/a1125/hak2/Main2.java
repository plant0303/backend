package a1125.hak2;

public class Main2 {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 20100311, 10, 20, 30);

        System.out.println("이름: " + student.getName());
        System.out.println("학번: " + student.getStdNum());
        System.out.println("국어: " + student.getScore1());
        System.out.println("수학: " + student.getScore2());
        System.out.println("영어: " + student.getScore3());
        System.out.println("평균: " + student.getAvg());


        Student std2 = new Student();
        std2.setName("경자");
        std2.setStdNum(20145624);
        std2.setScore1(90);
        std2.setScore2(85);
        std2.setScore3(95);

        System.out.println("이름 : " +std2.getName() );
        System.out.println("학번: " + std2.getStdNum());
        System.out.println("국어: " + std2.getScore1());
        System.out.println("수학: " + std2.getScore2());
        System.out.println("영어: " + std2.getScore3());
        System.out.println("평균: " + std2.getAvg());

    }
}
