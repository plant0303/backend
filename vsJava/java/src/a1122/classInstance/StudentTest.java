package a1122.classInstance;

public class StudentTest {
    public static void main(String[] args) {
        Student park = new Student(2019122104, "Park");
        Student kim = new Student(2019122107, "Kim");
        Student lee = new Student(2019122109, "Lee");
        System.out.printf("Student 객체의 수: %d", Student.count );
    }
    
}
class Student{
    static int count = 0;
    int id;
    String name;
    public Student(int id, String name) {
        Student.count++;
        this.id = id;
        this.name = name;
    }

}
