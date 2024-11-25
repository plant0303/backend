package a1125.this1;

public class MyClass1 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        obj1.myMethod();
        MyClass obj2 = new MyClass();
        obj2.myMethod();
    }
}
class MyClass{
    int myVariable;

    public MyClass(int myVariable){
        // this: 해당 객체. 객체 필드를 가리킴
        this.myVariable = myVariable;
    }

    public MyClass(){
        // this: 다른 생성자 호출. 다른 생성자 호출
        this(0);
    }

    public void myMethod(){
        // this: 해당 객체
        System.out.println("My variable value is " + this.myVariable);
    }
}

// this와 this()의 차이
// 객체 참조 / 생성자 호출 역할