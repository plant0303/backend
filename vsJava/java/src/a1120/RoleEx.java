package a1120;

public class RoleEx {
    public static void main(String[] args) {
        Role role = Role.ADMIN;

        System.out.println("현재 역할: " + role);
        System.out.println("일반 사용자 역할: " + Role.USER);

        if(role == Role.ADMIN){
            System.out.println("관리자 권한이 있습니다.");
        } else if(role == Role.USER){
            System.err.println("일반 사용자입니다.");
        }
    }
}
