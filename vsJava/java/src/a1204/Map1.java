package a1204;

import java.util.HashMap;
import java.util.Map;

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

public class Map1 {
    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student(101, "Alice", 20));
        studentMap.put(2, new Student(201, "Bob", 22));
        studentMap.put(3, new Student(301, "Charlie", 21));

        System.out.println("Student Map 출력");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("key : " + entry.getKey() + ". Value : " + entry.getValue());
        }

        System.out.println("특정 키의 student 정보");
        Student student = studentMap.get(2);
        System.out.println(student);

        System.out.println("\n모든 학생의 이름 출력");
        for (Student s : studentMap.values()) {
            System.out.println(s.getName());
        }

        // 학생 추가
        addStudent(studentMap, 4, 104, "Jhon", 27);

        // 학생 수정
        updateStudent(studentMap, 1, "Alice", 21);

        // 학생 삭제
        deleteStudent(studentMap, 1);

        // 학생 한명 보여주기
        System.out.println("특정키 (2)의 Student 정보 읽기");
        Student s = readStudent(studentMap, 2);
        System.out.println(s != null ? s : "찾는 학생이 없습니다");
    }

    private static Student readStudent(Map<Integer, Student> studentMap, int key) {
        if(studentMap.containsKey(key)){
            return studentMap.get(key);
        }
        return null;
    }

    private static void deleteStudent(Map<Integer, Student> studentMap, int key) {
        if (studentMap.containsKey(key)) {
            Student removStudent = studentMap.remove(key);
            System.out.println("학생 삭제: " + removStudent);
        } else {
            System.out.println("학생을 찾을 수 없습니다");
        }

    }

    private static void updateStudent(Map<Integer, Student> studentMap, int key, String newName, int age) {
        Student student = studentMap.get(key);
        if (student != null) {
            student.setName(newName);
            student.setAge(age);
            System.out.println("학생정보수정: " + student);
        } else {
            System.out.println("학생을 찾을 수가 없어요");
        }
    }

    private static void addStudent(Map<Integer, Student> studentMap, int key, int id, String name, int age) {
        Student student = new Student(id, name, age);
        studentMap.put(key, student);

    }
}
