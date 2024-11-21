package a1121.anC2;

public class StudentEx {
    public static void main(String[] args) {
        Student student1 = new Student("유영수", 31, "2013000000", "컴공");

        Student student2 = new Student("김승현", 20, "20230002", "전자공학");

        print(student1);
        print(student2);
        
    }

    public static void print(Student student){
        System.out.println();
        System.out.println("#### 학생 ####");
        System.out.println("학생1 - 이름: " + student.name);
        System.out.println("학생1 - 나이: " + student.age);
        System.out.println("학생1 - 학번 : " + student.stdNo);
        System.out.println("학생1 - 전공: " + student.major);
        student.study("java");
        int[] score = {10, 20, 30, 40, 50};
        System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(10, 20));
        System.out.println("학생1 - 기말고사 점수 : " + student.getAverage(30, 40, 50));
        System.out.println("학생1 - 최종평균 점수 : " + student.getAverage(score));
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       