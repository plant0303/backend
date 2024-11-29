package a1129.Interface;

interface Flyable {
    void fly();
    static void sleep(){
    
    }
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("새 난다 하늘");
    }
}

class Fish implements Swimmable{
    @Override
    public void swim() {
    System.out.println("물고기 수영한다");        
    }
    
}

public class Interface2 {
    
}
