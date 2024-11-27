package a1127.zoo;

public class Fish extends Animal {
    public Fish(String name, int age){
        super(name, age);
    }
    @Override
    public void move() {
        System.out.print("지느러미로 헤엄을 친다, ");
    }

    @Override
    public void sound() {
        System.out.print("..., ");
    }
}
