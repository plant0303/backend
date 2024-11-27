package a1127.downcasting;

class Animal{
    public void move(){
        System.out.println("움직입니다.");
    }
}
class Bird extends Animal{
   
    public void bark(){
        System.out.println("짹짹");
    }
    @Override
    public void move() {
        System.out.println("날아갑니다.");
    }
}

public class DownCasting1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        animal.move();
        bird.bark();
        bird.move();

        Animal animal_downcasting = new Bird();
        animal_downcasting.move(); // 움직입니다 -> 날아갑니다로 변경
        // animal_downcasting.bark();  부모 안에 있는 메서드만 가능
    }
}
