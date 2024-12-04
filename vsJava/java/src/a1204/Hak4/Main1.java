package a1204.Hak4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 101));
        students.add(new Student("Blice", 22, 102));
        students.add(new Student("Clice", 28, 103));

        Collections.sort(students);
        for(Student student : students){
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int studentId;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student 나이순 정렬 [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

}
