package a1127.upcasting;

public class UpCastingEx {
    public static void main(String[] args) {
        // 업캐스팅
        Child childObj = new Child();
        Parent parentRef = childObj;  // 자식 객체를 부모 타입으로 참조 (업캐스팅)
        parentRef.show();  // 부모 클래스에서 정의된 show() 메서드 호출

        // 다운캐스팅
        Parent parentObj = new Child();  // 부모 타입으로 자식 객체 생성 (업캐스팅)
        Child childRef = (Child) parentObj;  // 부모 객체를 자식 타입으로 변환 (다운캐스팅)
        childRef.show();  // 자식 클래스에서 오버라이딩한 show() 메서드 호출
    }
}

class Parent{
    public void show(){
        System.out.println("부모 클래스 메서드");
    }
}
class Child extends Parent{

    @Override
    public void show() {
        System.err.println("자식클래스 메서드");
    }
}
