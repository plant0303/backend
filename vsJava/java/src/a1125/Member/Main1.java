package a1125.Member;

public class Main1 {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");
        if (result) {
            System.out.println("로그인되있습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 passward가 올바르지 않아요");
        }
    }
}

class MemberService {
    private String id;
    private String password;

    public boolean login(String string, String string2) {
        this.id = string;
        this.password = string2;
        if(id.equals("hong") && password.equals(string2)){
            return true;
        } else{
            return false;
        }
    }

    public void logout(String string) {
        System.out.println(string +  "님 로그아웃 되었습니다.");
     }

}
