package a1129.Interface;

interface Flyable2 {
    void fly();
    default void sleep(){ 

    }
}

interface Swimmable2 {
    void swim();
}

class Bird2 implements Flyable2 {
    @Override
    public void fly() {
        System.out.println("새 난다 하늘");
    }
}

class Fish2 implements Swimmable2 {
    @Override
    public void swim() {
        System.out.println("물고기 수영한다");
    }

}

public class Interface3 {
    public static void main(String[] args) {
        Bird2 bird = new Bird2();
        bird.fly();
        bird.sleep();
    }
}
