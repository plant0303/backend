package a1127.downcasting;

public class DownCasting {
    public static void main(String[] args) {
        Parent parentRef = new Parent();
        parentRef.show();
        if (parentRef instanceof Child) {
            Child childRef = (Child) parentRef; // 명시적 형변환
            childRef.childspecial();
        } else{
            System.out.println("다운 캐스팅 실패");
        }
    }
}

class Parent {
    void show() {
        System.out.println("부모 클래스 메서드");
    }
}

class Child extends Parent {

    @Override
    void show() {
        System.err.println("자식클래스 메서드");
    }

    public void childspecial() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'childspecial'");
    }

}