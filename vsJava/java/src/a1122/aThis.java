package a1122;

public class aThis {
    public static void main(String[] args) {
        Person person = new Person("alice");
        person.display();
    }
}

class Person{
    
    String name;
    public Person(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("name: " + name);
    }
}