package a1128.Abstract2;

abstract class Animal{
    public void eat(){
        System.out.println("This animal eats food");
    }

    public abstract void makeSound();
}
class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("왈왈왈왈아ㅗㄹ랑라어러어러엌");        
    }

}


public class AbstrackEx {
    public static void main(String[] args) {
        // 객체를 직접 다룸
        // Dog dog = new Dog();
        // dog.makeSound();

        // 업캐스팅
        Animal dog = new Dog();
        dog.makeSound();

        // 결과는 같다...
    }
}
