package a1129.Library;

import java.util.Scanner;

public class LibraryController {
    private static final Scanner sc = new Scanner(System.in);
    private static final LibraryManager manager = new LibraryManager();

    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            showMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showBookList();
                    break;
                case 2:
                    bookLoan();
                default:
                    break;
            }

        }

    }

    private static void bookLoan() {
        // 2번 도서 대출
        System.out.println("도서 대출");
        System.out.print("대출 도서의 이름을 입력하세요> ");
        String name = sc.nextLine();
        manager.libraryLoanList(name);
        
    }

    private static void showBookList() {
        // 1번 도서 목록 확인
        System.out.println("도서 목록");
        manager.showBook();
    }

    private static void showMenu() {
        System.out.println("\n*****도서관 메인 페이지*****");
        System.out.println("1. 도서 목록 확인");
        System.out.println("2. 도서 대출");
        System.out.println("3. 도서 반납");
        System.out.println("4. 도서 대출 확인");
        System.out.println("5. 도서 추가");
        System.out.println("6. 도서 삭제");
        System.out.println("7. 종료");
    }
}
