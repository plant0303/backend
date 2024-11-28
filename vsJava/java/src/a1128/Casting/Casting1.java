package a1128.Casting;

class Animal{
    void makeSound(){
        System.out.println("some sound");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Woof");
    }
}

public class Casting1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Animal myAnimal = myDog; //업캐스팅
        myAnimal.makeSound();

        Animal myAnimal2 = new Dog();

        Dog dogRef = (Dog)myAnimal;
        dogRef.bark();
    }
}
