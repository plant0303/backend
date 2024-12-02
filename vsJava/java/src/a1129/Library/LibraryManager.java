package a1129.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private ArrayList<Library> allBook;
    private ArrayList<Library> loanBook;

    public LibraryManager() {
        // 생성자에서 도서 목록을 초기화

        allBook = new ArrayList<>();
        loanBook = new ArrayList<>();
        // false일때 대출중 true일때
        allBook.add(new Library("인어공주", "안데르센", 2020, true));
        allBook.add(new Library("햄릿", "셰익스피어", 2018, true));
        allBook.add(new Library("어린왕자", "생텍쥐페리", 2000, false));

    }

    // 도서 목록 조회
    public void showBook() {
        System.out.println("전체 도서 조회");
        for (Library book : allBook) {
            System.out.println(book);
        }

    }

    // 도서 대출하기
    public boolean libraryLoanList(String name) {
        for (Library book : allBook) {
            if (book.getName().equalsIgnoreCase(name)) { // 도서 이름이 일치하는 경우
                if (book.isLoan()) { // 이미 대출 중이면
                    book.setLoan(false); // 대출 처리 (대출 중으로 상태 변경)
                    loanBook.add(book); // 대출 목록에 추가
                    return true; // 대출 성공
                } else { // 대출 중이 아니면
                    System.out.println("이미 대출 중인 도서입니다.");
                    return false; // 대출 불가
                }
            }
        }

        return false; // 해당 도서를 찾을 수 없는 경우
    }

    // 도서 반납
    public boolean libraryReturnBook(String name) {
        for (Library book : loanBook) {
            if (book.getName().equalsIgnoreCase(name)) {
                book.setLoan(true);
                loanBook.remove(book);
                return true;
            }
        }
        return false;
    }


    public void searchLoanList() {
        // 대출 목록 확인
        if (loanBook == null) {
            System.out.println("대출하신 도서가 없습니다");
        }
        for (Library book : loanBook) {
            System.out.println(book);
        }
    }

    // 도서 추가
    public void addBookList(String addBookName, String addBookAuthor, int addBookYear, boolean addBoolLoan) {   
        allBook.add(new Library(addBookName, addBookAuthor, addBookYear, addBoolLoan));
        System.out.printf("제목: %s,  저자: %s,   출판연도: %d  이 추가되었습니다.", addBookName, addBookAuthor, addBookYear);
    }

    // 도서 삭제
    public void removeBooList(String removeBookName) {
        for(Library book : allBook){
            if(book.getName().equalsIgnoreCase(removeBookName) && !book.isLoan()){
                System.out.println("대출중인 도서는 삭제할 수 없습니다.");
                break;
            } else{
                allBook.remove(book);
                System.out.println(removeBookName + " 도서를 삭제했습니다.");
                break;
            }
        }
    }

    // 도서 수정
    public void updateBookList(String updateBookName) {
        int index = searchIndex(updateBookName);
        Scanner sc = new Scanner(System.in);

        System.out.print("책 이름> ");
        String bookName = sc.nextLine();

        System.out.print("책 저자> ");
        String bookAuthor = sc.nextLine();

        System.out.print("책 발행연도> ");
        int bookYear = sc.nextInt();
        sc.nextLine();

        System.out.print("책 대출 여부(대출가능/불가능)> ");
        String bookLoan = sc.nextLine();
        boolean updateLoan = bookLoan.equalsIgnoreCase("대출가능") ? true : false;

        Library updateBook = allBook.get(index);
        updateBook.setName(bookName);
        updateBook.setAuthor(bookAuthor);
        updateBook.setYear(bookYear);
        updateBook.setLoan(updateLoan);

        System.out.println(allBook.get(index));
    }

    // 수정할 인덱스
    public int searchIndex(String updateBookName){
        int index = 0;
        for(int i = 0; i < allBook.size(); i++){
            if(allBook.get(i).equals(updateBookName)){
                index = i;
                break;
            }   
        }
        return index;
    }
}
