package a1125.Bank;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------");
            System.out.println("1. 계좌생성, 2.계좌목록, 3.예금, 4. 출금, 5. 종료");
            System.out.println("----------------------------------------------");
            int selectNo = Integer.parseInt(sc.nextLine());
            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
    }

    private static void createAccount() {
        System.out.println("-----------");
        System.out.println(" 계좌생성 ");
        System.out.println("-----------");
        System.out.print("계좌번호:");
        String ano = sc.nextLine();

        System.out.print("계좌주:");
        String owner = sc.nextLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(sc.nextLine());

        Account newAccount = new Account(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {// 0부터 100까지 순회하면서
            if (accountArray[i] == null) {// 비어있는 방이있으면
                accountArray[i] = newAccount;
                System.out.println("결과 : 계좌가 생성되엇습니다.");
                break;
            }
        }

    }

    private static void accountList() {
        System.out.println("-------------");
        System.out.println("  계좌생성  ");
        System.out.println("-------------");
        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (account != null) {

                System.out.print(account.getAno() + "\t");
                System.out.print(account.getOwner() + "\t");
                System.out.print(account.getBalance() + "\n");
            }
        }
    }

    private static void deposit() {
        System.out.println("--------");
        System.out.println("  예금  ");
        System.out.println("--------");
        System.out.print("계좌번호: ");
        String ano = sc.nextLine();
        System.out.println("예금액: ");
        int money = Integer.parseInt(sc.nextLine());
        Account account = finfAccount(ano);
        if (account == null) {
            System.out.println("존재하지 않는 계좌입니다.");
        } else {
            account.setBalance(account.getBalance() + money);
            System.out.println("입금확인. " + ano + " 계좌에 " + money + "원이 예금되었습니다.");
            System.out.println("잔액: " + account.getBalance());
        }
    }

    private static Account finfAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                String dbAno = accountArray[i].getAno();
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }

    private static void withdraw() {
        System.out.println("--------");
        System.out.println("  출금  ");
        System.out.println("--------");
        System.out.print("계좌번호: ");
        String ano = sc.nextLine();
        System.out.println("출금액: ");
        int money = Integer.parseInt(sc.nextLine());
        Account account = finfAccount(ano);
        if(account == null){
            System.out.println("존재하지 않는 계좌입니다.");
        } else{
            account.setBalance(account.getBalance() - money);
            System.out.println(ano + "계좌에서" + money + "원이 출금되었습니다.");
            System.out.println("잔액: " + account.getBalance());
        }
    }
}
