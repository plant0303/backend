package a1127.Animal;

// 추상 클래스
abstract class Animal {
    String name;

    // 생성자
    public Animal(String name) {
        this.name = name;
    }

    // 추상 메서드: 자식 클래스에서 구현해야 한다.
    public abstract void sound();

    // 일반 메서드
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Dog 클래스는 Animal을 상속받아 추상 메서드를 구현
class Dog extends Animal {
    
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Woof!");
    }
}

// Cat 클래스는 Animal을 상속받아 추상 메서드를 구현
class Cat extends Animal {
    
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Animal 클래스는 인스턴스를 만들 수 없지만, 이를 상속한 Dog나 Cat은 생성할 수 있다.
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.sound();  // 출력: Buddy says: Woof!
        dog.eat();    // 출력: Buddy is eating.

        cat.sound();  // 출력: Whiskers says: Meow!
        cat.eat();    // 출력: Whiskers is eating.
    }
}
