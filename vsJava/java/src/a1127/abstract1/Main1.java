package a1127.abstract1;

abstract class Animal {
    // 추상클래스

    String name;

    public Animal(String name) {
        // 파라미터를 받는 생성자
        this.name = name;
    }

    public abstract void sound(); //추상메소드
}


class Dog extends Animal{
    public Dog(String name){
        // 파라미터를 받는 생성자
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + "은 왈왈");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + "은 야옹");
    }

}
public class Main1 {
    public static void main(String[] args) {
        // Animal animal = new Animal(); 이런식으로 인스턴스 객체 생성하는거 불가능하다
        Animal AnimalDog = new Dog("멍멍이"); //업캐스팅
        Animal AnimalCat = new Cat("애용이"); //업캐스팅

        AnimalDog.sound();
        AnimalCat.sound();
        
    }

}
