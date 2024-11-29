package a1129.Interface;

interface Animal {
    public abstract void cry();
    
}

class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("나옹나옹");
    }
} 

class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("멍멍");
    }

}

public class Interface1 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.cry();
        dog.cry();
    }
}
