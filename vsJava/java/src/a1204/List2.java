package a1204;

import java.util.ArrayList;
import java.util.List;

class Student {

    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class List2 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Alice", 20));
        studentList.add(new Student(201, "Bob", 22));
        studentList.add(new Student(301, "Charlie", 21));

        for (Student std : studentList) {
            System.out.println(std);
        }

        System.out.println("특정 인데스의 student 정보");
        Student student = studentList.get(1);
        System.out.println(student);

        System.out.println("모든 학생 이름 출력");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // 데이터 추가
        System.out.println("\n새로운 학생 추가");
        studentList.add(new Student(401, "babo", 23));
        printList(studentList);

        // 데이터 수정
        System.out.println("\n특정 학생 변경");
        updateStudent(studentList, 102, "Robert", 25);
        printList(studentList);

        // 데이터 삭제
        System.out.println("\n특정 학생 삭제");
        deleteStudent(studentList, 201);
        printList(studentList);

        // 데이터 검색
        System.out.println("\n특정 학생 검색");
        Student searcStudent = findStudentById(studentList, 104);
        System.out.println(searcStudent != null ? searcStudent : "학생을 찾을 수 없습니다");
    }

    private static Student findStudentById(List<Student> studentList, int i) {
        for(Student std : studentList){
            if(std.getId() == i){
                return std;
            }
        }
        return null;
    }

    private static void deleteStudent(List<Student> studentList, int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                System.out.println("학생ID " + id + "정보가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("학생 정보를 찾을 수 없음");
    }

    private static void updateStudent(List<Student> studentList, int id, String newName, int newAge) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.setName(newName);
                student.setAge(newAge);
                System.out.println("학생ID: " + id + "정보가 수정되었습니다.");
                return;
            }
        }
        System.out.println("학생id " + id + "를 찾을 수 없습니다.");
    }

    private static void printList(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
