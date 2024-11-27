package a1127.zoo;

public class Bird extends Animal{
    public Bird(String name, int age){
        super(name, age);
    }
    @Override
    public void move() {
        System.out.print("날개로 날아간다 ");
    }

    @Override
    public void sound() {
        System.out.print("깎깎, ");
    }

}
