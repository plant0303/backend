package a1212.Lotto;

import java.util.Calendar;
import java.util.Scanner;

public class Membership {
    String name;
    String personalYY;
    String personalMM;
    String personalDD;
    String email;
    String address;
    String pw;

    public void MembershipGuid() {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                " \n\n ##        ####    ######   ######   ######   #####    ##  ##  \r\n"
                        + " ##       ##  ##     ##       ##     ##       ##  ##   ##  ##  \r\n"
                        + " ##       ##  ##     ##       ##     #####    #####    ###### \r\n"
                        + " ##       ##  ##     ##       ##     ##       ## ##      ##    \r\n"
                        + " ######    ####      ##       ##     ######   ##  ##     ##");

        System.out.println("\n[INFO] 안녕하세요. 동행로또입니다.\n"
                + "로또 구입을 위해선 회원가입이 필요합니다.\n"
                + "회원가입을 진행하시겠습니까?\n"
                + "[1] 예\t[2] 아니요");

        String answer = "";

        for (;;) {
            System.out.println("\n입력: ");
            answer = sc.nextLine();
            if (answer.equals("1") || answer.equals("예")) {
                personalData();
                break; // 특정조건을 충족하면 반복문을 종료
            } else if (answer.equals("2") || answer.equals("아니오")) {
                System.out.println("\n[ERROR] 회원이 아니면 로또를 구해할 수 없습니다.");
                System.exit(0);// 현재 실행중인 자바 프로그램 종료
            } else {
                System.out.println("\n[ERROR] 잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    private void personalData() {

       Scanner sc = new Scanner(System.in);
        System.out.println("\n=================================================================\n");
		System.out.println("[INFO] 회원가입을 위해 아래의 양식을 채워주세요.\n");
		
		System.out.print("* 이름 : ");
		this.name = sc.next();	

        //미성년자는 가입할 수 없다.
        // 생년월일은 조건에 맞지 않으면 다시 입력을 해야한다.
        int personalYYnum = 0;
		int personalMMnum = 0;
		int personalDDnum = 0;

        //입력하는 연도가 올해를 넘기지 않게 만든다.
        Calendar cal = Calendar.getInstance();
        int yy = cal.get(Calendar.YEAR); //현재연도

        System.out.println("태어난 연도 4자리");
        this.personalYY = sc.next();
        personalYYnum = Integer.parseInt(personalYY);

        if(personalYYnum == yy || personalYYnum > yy - 20 && personalYYnum < yy){
            System.out.println("[ERROR] 미성년자는 로또를 구매할 수 없습니다."
            + "\n 회원가입이 종료됩니다.");
            System.exit(0);
    }
}