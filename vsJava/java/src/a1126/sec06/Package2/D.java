package a1126.sec06.Package2;
import a1126.sec06.Package1.A;
public class D extends A{
    public D(){
        super();
    }

    public void method(){
        // A필드값 변경
        this.field = "value";
        this.method();
    }

    public void method2(){
        // protected는 접근 불가능
        // A a = new A();
        // a.field = "value";
        // a.method();
    }
}
