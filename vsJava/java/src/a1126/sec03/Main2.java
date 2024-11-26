package a1126.sec03;

class Parent2 {
    int x = 10;
    public void show(){
        System.out.println("Parent show()");
    }
}

class Child2 extends Parent2 {
    int x = 20;
    public void display(){
        System.out.println("X in child: " + x);
        System.out.println("X in parent: " + super.x);
        super.show();
        // super(): 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출
        // 부모 클래승의 기본 생성자가 없으면 자식 클래스에서 super()으로 부모 클래스의 매개변수를 명시적 호출
        // super를 사용해 부모 클래스의 필드나 메소드 접근 가능
        // super는 자식 쿨래스의 생성자에서 첫번째로 호출
    }
}

public class Main2 {
    public static void main(String[] args) {
        Child2 child = new Child2();
        child.display();
    }
}
