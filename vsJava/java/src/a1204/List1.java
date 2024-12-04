package a1204;

import java.util.ArrayList;
import java.util.List;

class Student{

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

public class List1 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Alice", 20));
        studentList.add(new Student(201, "Bob", 22));
        studentList.add(new Student(301, "Charlie", 21));

        for(Student std : studentList){
            System.out.println(std);
        }

        System.out.println("특정 인데스의 student 정보");
        Student student = studentList.get(1);
        System.out.println(student);

        System.out.println("모든 학생 이름 출력");
        for(Student s : studentList){
            System.out.println(s);
        }
    }
}
