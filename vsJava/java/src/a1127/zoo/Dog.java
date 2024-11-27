package a1127.zoo;

public class Dog extends Animal{

    public Dog(String name, int age){
        super(name, age);
    }
    
    @Override
    public void move() {
        System.out.print("네 발로 걷는다");
        
    }

    @Override
    public void sound() {
        System.out.print("멍멍멍멍, ");        
    }
    

}
