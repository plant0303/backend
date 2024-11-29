package a1129.Interface;

interface Swimmable{
    void swim();
    static void checkWater(){
        System.out.println("물이 깨끗한지 확인");
    }
}

class Fish3 implements Swimmable{

    @Override
    public void swim() {
        System.out.println("물고기가 수영한다");        
    }
}

public class Interface4 {
    public static void main(String[] args) {
        Fish3 fish = new Fish3();
        fish.swim();

        // static메서드는 인터페이스 이름으로 호출 가능
        Swimmable.checkWater();
    }    
}
