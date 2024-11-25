package a1125.Person;

public class Person {
    // 정적변수
    private static int count;
    private String name;
    private int age;
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Person.count = count;
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
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
    // 정적메서드. 객체를 생성하지 않고 클래스 이름으로 직접 접근할 수 있는 메소드
    public static int getTotalCount() {
        return count;
    }
}
