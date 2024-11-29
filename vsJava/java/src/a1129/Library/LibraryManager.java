package a1129.Library;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Library> allBook;

    public LibraryManager() {
        // 생성자에서 도서 목록을 초기화

        allBook = new ArrayList<>();
        allBook.add(new Library("어린 왕자", "생택쥐페리", "0001", 8000, true));
        allBook.add(new Library("이것이 자바다", "신용권", "0002", 38000,true));
        allBook.add(new Library("인간JS되기", "제로초", "0003", 20000, false));
    }

    public void showBook() {
        // 도서 목록 조회
        System.out.println("전체 도서 조회");
        for (Library book : allBook) {
            System.out.println(book);
        }


    }

    public void libraryLoanList(String name) {
        // 도서 대출하기
        
    }


    
}
