package a1129.Array;

public class Ab1 {
    public static void main(String[] args) {
        // Animal 타입 변수로 Cat과 Dog 객체를 참조
        Animal cat = new Cat();
        Animal dog = new Dog();

        // 각 객체의 cry() 메서드 호출
        cat.cry();  // 애욘
        dog.cry();  // 왈알
    }
}

abstract class Animal {
    int a = 10; // 인스턴스 변수
    abstract void cry(); // 추상 메서드
}

class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("애욘"); // 구현된 cry() 메서드
    }
}

class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("왈알"); // 구현된 cry() 메서드
    }
}
