package a1125.Member;

public class Member {
    public static void main(String[] args) {
        MemberClass user1 = new MemberClass("홍길동", "hong");
    }
}

class MemberClass{
    private String name;
    private String id;
    private String password;
    private int age;
    
    public MemberClass(String name, String id) {
        this.name = name;
        this.id = id;
    }

}