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
            sc.nextLine();
            switch (choice) {
                case 1:
                    showBookList();
                    break;
                case 2:
                    bookLoan();
                    break;
                case 3:
                    bookReturn();
                    break;
                case 4:
                    loanList();
                    break;
                case 5:
                    addBook();
                    break;
                case 6:
                    removeBook();
                    break;
                case 7:
                    updateBook();
                    break;
                case 8:
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                    break;
                default:
                    break;
            }

        }

    }

    // 7번 도서 업데이트
    private static void updateBook() {
        System.out.println("도서 수정");
        System.out.print("수정할 도서 이름> ");
        String updateBookName = sc.nextLine();
        manager.updateBookList(updateBookName);
    }

    // 6번 도서 삭제
    private static void removeBook() {
        System.out.println("도서 삭제");
        System.out.println("삭제할 도서 이름");
        String removeBookName = sc.nextLine();
        manager.removeBooList(removeBookName);
    }

    // 5번 도서 추가
    private static void addBook() {
        System.out.println("도서 추가");
        System.out.print("추가할 도서의 이름> ");
        String addBookName = sc.nextLine();

        System.out.print("추가할 도서의 저자> ");
        String addBookAuthor = sc.nextLine();

        System.out.print("추가할 도서의 발행연도> ");
        int addBookYear = sc.nextInt();

        boolean addBoolLoan = true;

        manager.addBookList(addBookName, addBookAuthor, addBookYear, addBoolLoan);
    }

    // 4번 대출 목록 확인
    private static void loanList() {
        manager.searchLoanList();
    }

    // 3번 도서 반납
    private static void bookReturn() {
        System.out.println("도서 반납");
        System.out.print("반납할 도서 이름을 입력하세요> ");
        String returnName = sc.nextLine();

        if (manager.libraryReturnBook(returnName)) {
            System.out.println(returnName + " 책이 반납되었습니다.");
        } else {
            System.out.println(returnName + " 도서가 대출 기록에 없습니다.");
        }
    }

    // 2번 도서 대출
    private static void bookLoan() {
        System.out.println("도서 대출");
        System.out.print("대출 도서의 이름을 입력하세요> ");
        String loanName = sc.nextLine();

        if (manager.libraryLoanList(loanName)) {
            System.out.println(loanName + " 도서를 대출했습니다.");
        } else {
            System.out.println("다시 입력하세요");
        }

    }

    // 1번 도서 목록 확인
    private static void showBookList() {
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
        System.out.println("7. 도서 수정");
        System.out.println("8. 종료");
    }
}
