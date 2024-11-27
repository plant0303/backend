package a1127.zoo;

public abstract class Animal {
    String name;
    int age;

    public Animal() {
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.print(name + "는 ");
    }


    public abstract void sound();

    public abstract void move();


}
