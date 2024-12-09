package a1209.arrayList1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, "S001"));
        students.add(new Student("Bob", 22, "S002"));
        students.add(new Student("Charlie", 19, "S003"));

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("\n1. 학생추가하기");
            System.out.println("2. 학생리스트");
            System.out.println("3. 학생수정");
            System.out.println("4. 학생삭제");
            System.out.println("5. Exit");
            System.out.println("선택하세요");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("이름을 넣으세요>>");
                    String n = sc.nextLine();

                    System.out.print("나이를 입력하세요>>");
                    int a = sc.nextInt(); // 숫자입력할때 20 \n(개행문자)
                    sc.nextLine(); // next()나 nextInt() 같은 메서드가 입력버퍼에 남긴 \n 제거

                    System.out.print("아이디를 입력하세요>>");
                    String id = sc.nextLine();

                    students.add(new Student(n, a, id));
                    System.out.println("학생 추가 성공");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("보여줄 학생 리스트없음");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 3:
                    System.out.println("수정할 학생 아이디를 입력하세요");
                    String addNum = sc.nextLine();
                    boolean addFound = false;
                    for(Student std : students){
                        if(std.getStudentId().equalsIgnoreCase(addNum)){
                            System.out.print("학생의 새로운 이름 정보: ");
                            std.setName(sc.nextLine());
                            System.out.print("학생의 새로운 나이 정보: ");
                            std.setAge(sc.nextInt());
                            sc.nextLine();
                            System.out.println("학생 정보 수정 완료");
                            addFound = true;
                            break;
                        }
                    }
                    if(!addFound){
                        System.out.println("그런 학생 없음");
                    }
                    break;
                case 4:
                    System.out.println("삭제할 학생 아이디를 입력하세요");
                    String deleteNum = sc.nextLine();
                    boolean delFound = false;
                    for(Student std : students){
                        if(std.getStudentId().equalsIgnoreCase(deleteNum)){
                            students.remove(std);
                            break;
                        }
                    }
                    if(!delFound){
                        System.out.println("그런 학생 없음");
                    }
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;
                default:
                    System.out.println("잘못입력함");
                    break;
            }
        }
    }
}
