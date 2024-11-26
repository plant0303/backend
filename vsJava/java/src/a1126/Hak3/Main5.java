package a1126.Hak3;

public class Main5 {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 25);
        System.out.println(person);
    }
}
class Person {
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString(){
        return "Person [name=" + name + ", age=" + "]";
    }
}